package ProjectAkhir;
import java.util.Scanner;

/**
 *
 * @author Bagaskara
 */
public class Project {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Scanner masukan1 = new Scanner(System.in);
        int motorBebek = 5, motorMatic = 4, motorSport = 2;
        int miniBus = 2, SUV = 4, sedan = 5;
        int hariMotorBebek, hariMotorMatic, hariMotorSport, hargaMotorBebek, hargaMotorMatic, hargaMotorSport;
        int hariMiniBus, hariSUV, hariSedan, hargaMiniBus, hargaSUV, hargaSedan;
        int pinjamMotorBebek = 0, pinjamMotorMatic = 0, pinjamMotorSport = 0;
        int pinjamMiniBus = 0, pinjamSUV = 0, pinjamSedan = 0;
        String pilihan1 = "";
        int jumlahMotorBebek = 0, jumlahMotorMatic = 0, jumlahMotorSport = 0;
        int jumlahMiniBus = 0, jumlahSUV = 0, jumlahSedan = 0;
        int jumlahHariMotorBebek = 0, jumlahHariMotorMatic = 0, jumlahHariMotorSport = 0;
        int jumlahHariMiniBus = 0, jumlahHariSUV = 0, jumlahHariSedan = 0;
        do {
            System.out.println("Selamat Datang di Perentalan Farhan");
            System.out.println("1. Motor\n2. Mobil\n3. Keluar Program");
            System.out.print("Pilih Menu : ");
            int pilihan = masukan.nextInt();
            if (pilihan == 1) {
                pilihan = jenisMotor();
                switch (pilihan) {
                    case 1:
                        motorBebek = stockMotorBebek(motorBebek, pinjamMotorBebek);
                        if (motorBebek != 0) {
                            System.out.println("Stock motor bebek : " + motorBebek);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamMotorBebek = masukan.nextInt();
                            if (motorBebek >= pinjamMotorBebek) {
                                System.out.println("Stock motor bebek : " + stockMotorBebek(motorBebek, pinjamMotorBebek));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariMotorBebek = masukan.nextInt();
                                jumlahMotorBebek += pinjamMotorBebek;
                                jumlahHariMotorBebek += hariMotorBebek;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock habis");
                        }
                        break;
                    case 2:
                        motorMatic = stockMotorMatic(motorMatic, pinjamMotorMatic);
                        if (motorMatic != 0) {
                            System.out.println("Stock motor matic : " + motorMatic);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamMotorMatic = masukan.nextInt();
                            if (motorMatic >= pinjamMotorMatic) {
                                System.out.println("Stock motor matic : " + stockMotorMatic(motorMatic, pinjamMotorMatic));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariMotorMatic = masukan.nextInt();
                                jumlahMotorMatic += pinjamMotorMatic;
                                jumlahHariMotorMatic += hariMotorMatic;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock habis");
                        }
                        break;
                    case 3:
                        motorSport = stockMotorSport(motorSport, pinjamMotorSport);
                        if (motorSport != 0) {
                            System.out.println("Stock motor sport : " + motorSport);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamMotorSport = masukan.nextInt();
                            if (motorSport >= pinjamMotorSport) {
                                System.out.println("Stock motor sport : " + stockMotorSport(motorSport, pinjamMotorSport));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariMotorSport = masukan.nextInt();
                                jumlahMotorSport += pinjamMotorSport;
                                jumlahHariMotorSport += hariMotorSport;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock habis");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia, silahkan masukan pilihan yang tersedia");
                        break;
                }
            } else if (pilihan == 2) {
                pilihan = jenisMobil();
                switch (pilihan) {
                    case 1:
                        miniBus = stockMiniBus(miniBus, pinjamMiniBus);
                        if (miniBus != 0) {
                            System.out.println("Stock Mini Bus : " + miniBus);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamMiniBus = masukan.nextInt();
                            if (miniBus >= pinjamMiniBus) {
                                System.out.println("Stock Mini Bus : " + stockMiniBus(miniBus, pinjamMiniBus));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariMiniBus = masukan.nextInt();
                                jumlahMiniBus += pinjamMiniBus;
                                jumlahHariMiniBus += hariMiniBus;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock habis");
                        }
                        break;
                    case 2:
                        SUV = stockSUV(SUV, pinjamSUV);
                        if (SUV != 0) {
                            System.out.println("Stock SUV : " + SUV);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamSUV = masukan.nextInt();
                            if (SUV >= pinjamSUV) {
                                System.out.println("Stock SUV : " + stockSUV(SUV, pinjamSUV));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariSUV = masukan.nextInt();
                                jumlahSUV += pinjamSUV;
                                jumlahHariSUV += hariSUV;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock habis");
                        }
                        break;
                    case 3:
                        sedan = stockSedan(sedan, pinjamSedan);
                        if (sedan != 0) {
                            System.out.println("Stock Sedan : " + sedan);
                            System.out.print("Masukan jumlah pinjam : ");
                            pinjamSedan = masukan.nextInt();
                            if (sedan >= pinjamSedan) {
                                System.out.println("Stock Sedan : " + stockSedan(sedan, pinjamSedan));
                                System.out.print("Masukan lama sewa (hari) : ");
                                hariSedan = masukan.nextInt();
                                jumlahSedan += pinjamSedan;
                                jumlahHariSedan += hariSedan;
                            } else {
                                System.out.println("Stock tidak mencukupi");
                            }
                        } else {
                            System.out.println("Stock Habis");
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia, silahkan masukan pilihan yang tersedia");
                        break;
                }
            } else if (pilihan == 3) {
                System.out.println("Anda keluar dari program");
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
            System.out.println("Apakah anda ingin kembali ke menu utama?(Y/N)");
            System.out.print("Masukan pilihan : ");
            pilihan1 = masukan1.nextLine();
        } while (pilihan1.equalsIgnoreCase("y"));
        int hargaMotor = hitungHargaMotorBebek(jumlahMotorBebek, jumlahHariMotorBebek) + hitungHargaMotorMatic(jumlahMotorMatic, jumlahHariMotorMatic) + hitungHargaMotorSport(jumlahMotorSport, jumlahHariMotorSport);
        int hargaMobil = hitungHargaMiniBus(jumlahMiniBus, jumlahHariMiniBus) + hitungHargaSUV(jumlahSUV, jumlahHariSUV) + hitungHargaSedan(jumlahSedan, jumlahHariSedan);
        System.out.println("Harga yang dibayarkan : Rp." + (hargaMotor + hargaMobil));
    }

    public static int stockMotorBebek(int motor, int pinjam) {
        if (motor >= pinjam) {
            motor -= pinjam;
        } else if (motor < pinjam) {
            motor = motor;
        } else if (motor == 0) {
            motor = 0;
        }
        return motor;
    }

    public static int stockMotorMatic(int motor, int pinjam) {
        if (motor >= pinjam) {
            motor -= pinjam;
        } else if (motor < pinjam) {
            motor = motor;
        } else if (motor == 0) {
            motor = 0;
        }
        return motor;
    }

    public static int stockMotorSport(int motor, int pinjam) {
        if (motor >= pinjam) {
            motor -= pinjam;
        } else if (motor < pinjam) {
            motor = motor;
        } else if (motor == 0) {
            motor = 0;
        }
        return motor;
    }

    public static int stockMiniBus(int mobil, int pinjam1) {
        if (mobil >= pinjam1) {
            mobil -= pinjam1;
        } else if (mobil < pinjam1) {
            mobil = mobil;
        } else if (mobil == 0) {
            mobil = 0;
        }
        return mobil;
    }

    public static int stockSUV(int mobil, int pinjam1) {
        if (mobil >= pinjam1) {
            mobil -= pinjam1;
        } else if (mobil < pinjam1) {
            mobil = mobil;
        } else if (mobil == 0) {
            mobil = 0;
        }
        return mobil;
    }

    public static int stockSedan(int mobil, int pinjam1) {
        if (mobil >= pinjam1) {
            mobil -= pinjam1;
        } else if (mobil < pinjam1) {
            mobil = mobil;
        } else if (mobil == 0) {
            mobil = 0;
        }
        return mobil;
    }

    public static int hitungHargaMotorBebek(int jumlahMotor, int jumlahHariMotor) {
        int harga = (jumlahMotor * jumlahHariMotor * 60000);
        return harga;
    }

    public static int hitungHargaMotorMatic(int jumlahMotor, int jumlahHariMotor) {
        int harga = (jumlahMotor * jumlahHariMotor * 70000);
        return harga;
    }

    public static int hitungHargaMotorSport(int jumlahMotor, int jumlahHariMotor) {
        int harga = (jumlahMotor * jumlahHariMotor * 150000);
        return harga;
    }

    public static int hitungHargaMiniBus(int jumlahMobil, int jumlahHariMobil) {
        int harga = (jumlahMobil * jumlahHariMobil * 800000);
        return harga;
    }

    public static int hitungHargaSUV(int jumlahMobil, int jumlahHariMobil) {
        int harga = (jumlahMobil * jumlahHariMobil * 500000);
        return harga;
    }

    public static int hitungHargaSedan(int jumlahMobil, int jumlahHariMobil) {
        int harga = (jumlahMobil * jumlahHariMobil * 300000);
        return harga;
    }

    public static int jenisMotor() {
        Scanner masukan = new Scanner(System.in);
        System.out.println("1. Motor Bebek (Rp.60.000/hari)\n2. Motor Matic (Rp.70.000/hari)\n3. Motor Sport(Rp.150.000/hari)");
        System.out.print("Masukan pilihan : ");
        int pilihan = masukan.nextInt();
        return pilihan;
    }

    public static int jenisMobil() {
        Scanner masukan = new Scanner(System.in);
        System.out.println("1. Mini Bus (Rp.800.000/hari)\n2. SUV (Rp.500.000/hari)\n3. Sedan (Rp.300.000/hari)");
        System.out.print("Masukan pilihan : ");
        int pilihan = masukan.nextInt();
        return pilihan;
    }
}
