-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Jul 2023 pada 08.36
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengaduanapp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `feedback_layanan`
--

CREATE TABLE `feedback_layanan` (
  `id_feedback` varchar(150) NOT NULL,
  `id_sarana` varchar(150) NOT NULL,
  `nama_siswa` varchar(150) NOT NULL,
  `nama_petugas` varchar(500) NOT NULL,
  `keterangan` varchar(150) NOT NULL,
  `saran` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `feedback_sarana`
--

CREATE TABLE `feedback_sarana` (
  `id_feedback` varchar(150) NOT NULL,
  `id_sarana` varchar(150) NOT NULL,
  `nama_siswa` varchar(150) NOT NULL,
  `jenis_sarana` varchar(50) NOT NULL,
  `nama_petugas` varchar(500) NOT NULL,
  `keterangan` varchar(150) NOT NULL,
  `saran` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` varchar(150) NOT NULL,
  `nama_kelas` varchar(200) NOT NULL,
  `jumlah_murid` int(20) NOT NULL,
  `walikelas` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nama_kelas`, `jumlah_murid`, `walikelas`) VALUES
('K0001', 'KELAS 1A', 20, 'Ibu Anih'),
('K0002', 'KELAS 2A', 29, 'Pak Wahyu'),
('K0003', 'KELAS 3A', 22, 'Ibu Denda'),
('K0004', 'KELAS 4A', 24, 'Ibu Endang'),
('K0005', 'KELAS 5A', 21, 'Ibu Sri'),
('K0006', 'KELAS 6A', 20, 'Pak Deden');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kepalasekolah`
--

CREATE TABLE `kepalasekolah` (
  `id` int(200) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nip` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `kepalasekolah`
--

INSERT INTO `kepalasekolah` (`id`, `nama`, `nip`) VALUES
(1, 'Siti Maryani, S.Pd', '197009021991022001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `layanan`
--

CREATE TABLE `layanan` (
  `id` varchar(150) NOT NULL,
  `namasiswa` varchar(100) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  `img` blob NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `layanan`
--

INSERT INTO `layanan` (`id`, `namasiswa`, `keterangan`, `img`, `status`) VALUES
('L0001', 'test', 'test', 0x312e706e67, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama_petugas` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`) VALUES
('P0001', 'superadmin', '123', 'superadmin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `sarana`
--

CREATE TABLE `sarana` (
  `id_sarana` varchar(150) NOT NULL,
  `nama_siswa` varchar(200) NOT NULL,
  `jenis_sarana` varchar(50) NOT NULL,
  `keterangan` varchar(500) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `nisn` int(100) NOT NULL,
  `nis` int(100) NOT NULL,
  `namasiswa` varchar(200) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(150) NOT NULL,
  `telepon` varchar(225) NOT NULL,
  `alamat` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` (`nisn`, `nis`, `namasiswa`, `kelas`, `jenis_kelamin`, `telepon`, `alamat`) VALUES
(71553700, 3153, 'ACHMAD HEYGAR', 'Kelas 5 A', 'laki-laki', '089603855163', 'JL.MUARA DALAM I'),
(72420064, 3059, 'VIVO MESSY FOURRANSYAH', 'Kelas 6 A', 'laki-laki', '089518849356', 'JL. TANJUNG BARAT'),
(72820766, 3221, 'Arthika Rahmadani', 'Kelas 6 A', 'perempuan', '08999291611', 'Jl. Muara Tj. Barat'),
(75426851, 3060, 'WILDAN ZAIDAN', 'Kelas 5 A', 'laki-laki', '089654327883', 'JL. .LEBAK SARI'),
(77906097, 3080, 'JEREMIA BULELENG', 'Kelas 6 A', 'laki-laki', '089523737081', 'TANJUNG BARAT'),
(78517056, 3079, 'MUHAMAD IKSAN SODIKIN', 'Kelas 5 A', 'laki-laki', '089636990973', 'GINTUNG'),
(81514353, 3105, 'SALLUMITHA ANDANI', 'Kelas 6 A', 'laki-laki', '085772711344', 'RANCHO INDAH'),
(81718347, 3089, 'AJI ADINATA PUTRA', 'Kelas 6 A', 'laki-laki', '089510054451', 'TANJUNG BARAT SELATAN'),
(82009553, 3113, 'MARCEL DANGOL PARDEDE', 'Kelas 5 A', 'laki-laki', '081290462084', 'NANGKA Gg.BACANG NO.83'),
(82143642, 3101, 'SAFILA SAYATI', 'Kelas 6 A', 'perempuan', '08872552057', 'MUARA'),
(82961665, 3100, 'ARDHAN PRATAMA', 'Kelas 6 A', 'laki-laki', '087771827750', 'LEBAK SARI'),
(83151174, 3215, 'MOHAMMAD AZIZ SAPUTRA', 'Kelas 6 A', 'laki-laki', '087883344480', 'Jl.Tanjung Barat'),
(83464652, 3224, 'MERRY NATASYAH', 'Kelas 6 A', 'perempuan', '085945034859', 'Graha Prima Blok M 13A No.8'),
(84646203, 3152, 'ABDILAH RAMADAN', 'Kelas 5 A', 'laki-laki', '089652031055', 'Jl.Gintung'),
(84730734, 3104, 'ANDINA ALIKATASYA PUTRI', 'Kelas 6 A', 'laki-laki', '08996332566', 'JL.RANCHO INDAH'),
(84990009, 3090, 'TISA AMELIA', 'Kelas 6 A', 'perempuan', '089522133916', 'JL.GINTUNG NO.14'),
(85074378, 3109, 'MUHAMMAD HAYKAL', 'Kelas 4 A', 'laki-laki', '089524798774', 'JL.RANCHO INDAH NO.26A'),
(85209895, 3107, 'KHAYLILAH ISKANDAR PUTRI', 'Kelas 6 A', 'perempuan', '085770006691', 'MUARA'),
(85292325, 3097, 'TIARA KESYA RAMADHAN', 'Kelas 6 A', 'perempuan', '0895344358792', 'GINTUNG'),
(85597860, 3095, 'NAYLA RAMADHANI', 'Kelas 6 A', 'perempuan', '08999290495', 'RANCHO INDAH DALAM'),
(86535053, 3103, 'RIELA GRACIA SIPAYUNG', 'Kelas 6 A', 'perempuan', '081281701441', 'MUARA'),
(86699320, 3085, 'ALIF TEGUH SAPUTRA', 'Kelas 4 A', 'laki-laki', '089517851215', 'RANCHO INDAH'),
(86911374, 3111, 'LAYLATUN NAJLA ISMAIL', 'Kelas 6 A', 'perempuan', '085718047709', 'TB.SIMATUPANG'),
(87143457, 3292, 'REZZY PUTRA RADHITIA', 'Kelas 6 A', 'laki-laki', '081210900937', 'BENTENG PORTUGIS'),
(87203944, 3114, 'WARDHA ZAHIRA', 'Kelas 6 A', 'perempuan', '085893711722', 'BACANG'),
(87271539, 3084, 'RAYA SAFITRI', 'Kelas 6 A', 'perempuan', '0895321043671', 'TANJUNG BARAT'),
(87740398, 3087, 'NUR AYYASY FAWWAZ', 'Kelas 6 A', 'perempuan', '08970731299', 'MUARA'),
(88348197, 3082, 'ALIFARIZZA IZZATA PUTABUGA', 'Kelas 6 A', 'perempuan', '08811944199', 'MUARA'),
(88389068, 3098, 'HALIZAH NUR RAMADHANI', 'Kelas 6 A', 'perempuan', '0895322284631', 'RANCHO INDAH NO.77'),
(88475644, 3099, 'RIZKY BACHTIAR', 'Kelas 6 A', 'laki-laki', '081389636557', 'RANCHO INDAH'),
(89180025, 3112, 'IRSYAD FIRJATULLAH', 'Kelas 6 A', 'laki-laki', '085770712727', 'MUARA'),
(89655065, 3174, 'RIZKI', 'Kelas 5 A', 'laki-laki', '082246853287', 'JL.MUARA NO.46'),
(89790543, 3088, 'NAZRIL DAFFA NANDIO UTOMO', 'Kelas 6 A', 'laki-laki', '089692329098', 'TANJUNG BARAT NO.28C'),
(91004616, 3204, 'SYAHFIRA RAHMADANI', 'Kelas 5 A', 'perempuan', '085945912814', 'JL.GINTUNG TANJUNG BARAT NO.18'),
(91366850, 3299, 'MUHAMMAD KEANDRE MAHARDIKA SETYAWAN', 'Kelas 6 A', 'laki-laki', '082113114043', 'Jl. Bacang No. 14'),
(91708767, 3117, 'RADEN AJENG ANDINI CAHAYA NINGRUM', 'Kelas 4 A', 'laki-laki', '081905690443', 'JL.RANCHO DALAM'),
(91884738, 3366, 'KHEISYA RIANSYAH PUTRI', 'Kelas 6 A', 'perempuan', '081299555802', 'Jl.Gintung Rt.006/006 '),
(91960530, 3206, 'SYAHWAL CAMELIA', 'Kelas 5 A', 'perempuan', '085717481003', 'Jl.Gintung'),
(92086054, 3171, 'NURIFZAL', 'Kelas 5 A', 'laki-laki', '088104440040', 'JL.GINTUNG NO.12'),
(92413952, 3116, 'NURI MEGA MAGFIRA', 'Kelas 6 A', 'perempuan', '089501774718', 'TANJUNG BARAT'),
(92870897, 3192, 'KAYLA FILZAH ASHARI PUTRI', 'Kelas 5 A', 'perempuan', '085718916438', 'JL.MUARA TANJUNG BARAT NO.34'),
(93767710, 3162, 'KANSA SALWA RAISYAH', 'Kelas 5 A', 'perempuan', '085780537475', 'Jl.Rancho Indah Dalam No.35A'),
(93836728, 3127, 'ALISYA DWI ANGGRENI', 'Kelas 6 A', 'perempuan', '0895412747140', 'NANGKA Gg.LANGGAR'),
(94408764, 3135, 'RAIHAN PUTRA ANWAR', 'Kelas 6 A', 'laki-laki', '085694937950', 'RANCHO INDAH'),
(94433367, 3251, 'RISKI AGUNG ANUGRAH', 'Kelas 4 A', 'laki-laki', '088213178354', 'JL.MUARA'),
(94466202, 3131, 'TONNY REGIANTO', 'Kelas 6 A', 'laki-laki', '089662747190', 'RANCHO INDAH DALAM'),
(94466363, 3173, 'RIO DEWA SAPUTRA', 'Kelas 5 A', 'laki-laki', '085211055008', 'JL.TANJUNG BARAT'),
(94617944, 3289, 'Hanifah Aulia Putri', 'Kelas 6 A', 'perempuan', '081387595226', 'Jl. Benda Bawah No. 70C Jeruk Purut'),
(94800739, 3136, 'MEISYA ADELIA SAHPUTRI', 'Kelas 6 A', 'perempuan', '085772711402', 'JL.MUARA'),
(95020921, 3440, 'JUAANI PUTRA HAMBALI', 'Kelas 6 A', 'laki-laki', '089603180397', 'TANJUNG BARAT'),
(95353095, 3371, 'ADITIA PRATAMA', 'Kelas 6 A', 'laki-laki', '081386017377', 'Jl.Rancho Indah'),
(95482891, 3198, 'NAJLA ZULFA SUMARJANI', 'Kelas 5 A', 'perempuan', '0895364401373', 'Jl.Muara'),
(95511558, 3193, 'KURNIAN DEFRAN ASYAWAL', 'Kelas 5 A', 'laki-laki', '088809638005', 'Jl.Gintung No.66B'),
(95565773, 3134, 'RARA FITRIANI PUTRI ABDILLAH', 'Kelas 6 A', 'perempuan', '085216648761', 'MUARA NO.70'),
(95726758, 3253, 'SASKIA WAHDANIA', 'Kelas 4 A', 'perempuan', '08979987005', 'JL.NANGKA GG.NANGKA'),
(95851816, 3161, 'JEHAN GELSI', 'Kelas 5 A', 'laki-laki', '089657950280', 'JL.MUARA NO.8'),
(95901849, 3219, 'IQBAL AHMAD RIYANTO', 'Kelas 6 A', 'laki-laki', '089663877520', 'Jl.Lebak Sari'),
(96295361, 3367, 'SYAFA SABRINA', 'Kelas 4 A', 'perempuan', '089625553434', 'Jl.H.Harun 5 Rt.007/003 '),
(96548088, 3128, 'NURLIANA SRISAWITRI', 'Kelas 6 A', 'perempuan', '081213195406', 'JL.MUARA'),
(96779554, 3166, 'MUHAMMAD FACHRI ARDHIANSYAH', 'Kelas 5 A', 'laki-laki', '085695542517', 'JL.RANCHO INDAH NO.67'),
(97093938, 3155, 'ALMAIRA ADIVA', 'Kelas 5 A', 'perempuan', '089522583786', 'JL.TANJUNG BARAT'),
(97137443, 3122, 'MINATIH', 'Kelas 6 A', 'perempuan', '081383392246', 'JL.RANCHO INDAH Gg.MASJID NURUL ISLAM'),
(97190738, 3165, 'MUHAMMAD AKHDAN', 'Kelas 5 A', 'laki-laki', '081219910531', 'JL.KEDUNG BUNI I TANJUNG BARAT NO.81B'),
(97512407, 3119, 'WAHYU MUHAMAD PARIS', 'Kelas 5 A', 'laki-laki', '085775644517', 'TANJUNG BARAT NO.44'),
(97533124, 3190, 'HUMAIROH HAFIZAH', 'Kelas 5 A', 'laki-laki', '081299634058', 'Jl.Muara No.9'),
(97684368, 3169, 'MUHAMMAD REZA ADRIAN', 'Kelas 5 A', 'laki-laki', '085715900205', 'JL.RANCHO INDAH DALAM'),
(97685377, 3196, 'MUHAMMAD AZRI ANGGARA', 'Kelas 5 A', 'laki-laki', '082112033828', 'Jl.Tanjung Barat No.73'),
(97782336, 3376, 'NURAINI FIANTI', 'Kelas 2 A', 'perempuan', '089502943577', 'JL.NANGKA NO.24'),
(98047588, 3205, 'SYERIEL AZKIA CHANIAGO', 'Kelas 5 A', 'perempuan', '088219446205', 'JL.MUARA NO.5'),
(98128053, 3164, 'MUHAMMAD FARIS AUDA', 'Kelas 5 A', 'laki-laki', '089623258770', 'JL.RANCHO INDAH DALAM NO.45'),
(98435445, 3126, 'AHNAF SAPUTRA PRATAMA', 'Kelas 6 A', 'laki-laki', '08561105100', 'RANCHO INDAH DALAM'),
(98935044, 3133, 'NOVKA NURFELIZHA SOFYAN', 'Kelas 6 A', 'perempuan', '081211667381', 'MUARA'),
(99180307, 3138, 'SHARON PUTRI SION PELLOKILA', 'Kelas 6 A', 'perempuan', '085772711325', 'GINTUNG I'),
(99249146, 3167, 'MUHAMMAD HAFIZD', 'Kelas 5 A', 'laki-laki', '0895364300746', 'Jl.Muara'),
(99522389, 3199, 'NAUFAL DEHANUSA', 'Kelas 5 A', 'laki-laki', '082249947390', 'Jl.Tanjung Barat No.17'),
(99741959, 3163, 'LIA FEBRIANA', 'Kelas 5 A', 'perempuan', '08989795047', 'JL.MUARA'),
(99755211, 3194, 'LATIFAH NURAINI', 'Kelas 5 A', 'laki-laki', '089526566394', 'JL.TANJUNG BARAT H.MAUN No.40'),
(99835889, 3202, 'RAMADHANU', 'Kelas 5 A', 'laki-laki', '0895412745885', 'Jl.Rancho Indah Dalam 3A'),
(101233231, 3249, 'MUHAMMAD TEGUH PAMUJI', 'Kelas 4 A', 'laki-laki', '0895411748743', 'JL.RANCHO INDAH'),
(101442257, 3250, 'NUR LINTANG BAHIYAH HASNA', 'Kelas 4 A', 'perempuan', '0895364638170', 'JL.RANCHO INDAH'),
(101592506, 3201, 'RAGASUCI FAYYADH ADRIAN', 'Kelas 5 A', 'laki-laki', '081385176299', 'Jl.Rancho Indah Dalam No.99A'),
(101710503, 3242, 'JUNIARTY', 'Kelas 4 A', 'perempuan', '083806071410', 'JL.LEBAK SARI'),
(101747908, 3200, 'PUTRA RAFFANSYAH', 'Kelas 5 A', 'laki-laki', '087810193275', 'JL.MUARA TANJUNG BARAT NO.46'),
(102093560, 3245, 'MUHAMAD AZRIL MIFTACH AFANI', 'Kelas 4 A', 'laki-laki', '081374825230', 'JL.H.E MAHJUR'),
(102158432, 3177, 'AIRA NASYIFA PUTRI FILDZAH', 'Kelas 5 A', 'perempuan', '087882268933', 'Jl.Tanjung Barat'),
(102520463, 3278, 'PUTRA ARIFIANSYAH', 'Kelas 4 A', 'laki-laki', '085779154100', 'JL.GINTUNG'),
(102558978, 3241, 'ISTIQMA', 'Kelas 4 A', 'perempuan', '089603855163', 'JL.TANJUNG BARAT'),
(102755452, 3203, 'SAFA KIRANA WIDIYATMOKO', 'Kelas 5 A', 'perempuan', '08988235962', 'Jl.Rancho Indah'),
(102824437, 3229, 'AJRIN GADISAZHUNA TAUFANI', 'Kelas 4 A', 'laki-laki', '081210851622', 'JL.RANCHO INDAH DALAM'),
(103025304, 3252, 'SASHIRA NAILA QAIREEN', 'Kelas 4 A', 'perempuan', '', 'JL.TANJUNG BARAT'),
(103762278, 3231, 'ANDREAS SEBASTIAN NUGROHO', 'Kelas 4 A', 'laki-laki', '085959992669', 'JL.RANCHO INDAH DALAM NO.26E'),
(103766604, 3304, 'ABDUL ROZAK', 'Kelas 3 A', 'laki-laki', '081290388806', 'KALIBATA TIMUR'),
(103924177, 3208, 'YUDIEPRIA MARDHATILLAH', 'Kelas 5 A', 'laki-laki', '087782680498', 'JL.RANCHO INDAH DALAM GINTUNG NO.13'),
(104032094, 3209, 'ZIILAL AL RIFA', 'Kelas 5 A', 'laki-laki', '085817011230', 'JL.RANCHO INDAH GG.MUARA II NO.41'),
(104927479, 3256, 'ZIFARA ARTA PRATIWI', 'Kelas 4 A', 'laki-laki', '083841574475', 'JL.LEBAK SARI'),
(104956486, 3281, 'RAYHAN ADITIA PRATAMA', 'Kelas 4 A', 'laki-laki', '085883281348', 'JL.RANCHO INDAH DALAM'),
(105398757, 3195, 'MUHAMMAD ARUNA FEBRIANSYAH', 'Kelas 5 A', 'laki-laki', '082113540020', 'Jl.Tanjung Barat'),
(105740418, 3258, 'ADITYA RIZKI NUGROHO', 'Kelas 4 A', 'laki-laki', '085694226450', 'JL.RANCHO INDAH NO.9'),
(105839079, 3248, 'MUHAMMAD SATRIA', 'Kelas 4 A', 'laki-laki', '087777995352', 'JL.MUARA I'),
(106181878, 3247, 'MUHAMMAD REYHAN SAH', 'Kelas 4 A', 'laki-laki', '085778344285', 'JL.MUARA DALAM'),
(106207641, 3240, 'HASNA FAIRUZ SYIFA', 'Kelas 4 A', 'perempuan', '081310897890', 'MUARA DALAM I'),
(106471968, 3178, 'ALDIFA WINIARTI NURCAHYANI', 'Kelas 5 A', 'laki-laki', '0895328701708', 'JL.NANGKA GG.H.SAIYAN 1 NO.7'),
(106537230, 3260, 'ALFIANSYAH RAMADHAN', 'Kelas 4 A', 'laki-laki', '08811360736', 'JL.JEMBATAN CILIWUNG'),
(106539046, 3254, 'SYAFIQ RAMADHANA HIFZI', 'Kelas 4 A', 'laki-laki', '085772635995', 'JL.MUARA DALAM NO.38'),
(106653378, 3257, 'ACHMAD RAZIQ ZAM ZAMMI', 'Kelas 4 A', 'laki-laki', '089517448663', 'JL.MUARA'),
(107710896, 3244, 'MALIK MISBAHUDIN', 'Kelas 4 A', 'laki-laki', '081317263579', 'JL.RANCHO INDAH'),
(107894993, 3243, 'MUHAMMAD GHUSTAF ABU RAHMAN', 'Kelas 4 A', 'laki-laki', '0895332113316', 'JL.RANCHO INDAH GG.H.MUHIYIN'),
(108149387, 3273, 'MUHAMMAD NABIIL MUSYAFFA', 'Kelas 4 A', 'laki-laki', '089648688198', 'JL.RANCHO INDAH'),
(108400789, 3197, 'MUHAMMAD BAIM AL GHAFFAR', 'Kelas 5 A', 'laki-laki', '089501775754', 'JL.TANJUNG BARAT SELATAN NO.8'),
(108440640, 3176, 'ACHMAD KAFIHADI SOFIAN', 'Kelas 5 A', 'laki-laki', '085773516807', 'Jl. Rancho Dalam'),
(108558491, 3277, 'NAJLA LUTFI YANA', 'Kelas 4 A', 'perempuan', '081285004092', 'JL.RANCHO INDAH DALAM'),
(108885488, 3286, 'SITI NUR FAUZIAH', 'Kelas 4 A', 'perempuan', '082111636971', 'JL.TANJUNG BARAT'),
(109384785, 3246, 'MUHAMMAD ILHAM', 'Kelas 4 A', 'laki-laki', '089639135938', 'JL.GINTUNG NO.20'),
(109484860, 3191, 'KARENA CINTA AQ ADA', 'Kelas 5 A', 'perempuan', '087775224484', 'JL.MUARA NO.28B'),
(109525104, 3228, 'ADITYA AHMAD', 'Kelas 4 A', 'laki-laki', '085717278560', 'JL.RANCHO INDAH'),
(109595711, 3207, 'VICKSY PUTRI AZZAHRA', 'Kelas 5 A', 'perempuan', '08995302571', 'Jl.Tanjung Barat jl.Buni No.105'),
(109751800, 3368, 'NAYLA PUTRI BERLIAN', 'Kelas 3 A', 'perempuan', '', 'KEL. GEDONG'),
(109813273, 3223, 'ARSY AFRIELA PERTIWI', 'Kelas 5 A', 'laki-laki', '087875637474', 'JL. RACHO INDAH DALAM NO. 74A'),
(109938818, 3227, 'ABDULLAH TSAQIIF', 'Kelas 4 A', 'laki-laki', '081584775897', 'JL.BUNI TANJUNG BARAT'),
(111638917, 3350, 'NADYA SHAFWA', 'Kelas 3 A', 'perempuan', '081389344947', 'JL.RANCHO INDAH'),
(112029818, 3348, 'KHAERUNNISA AULIA RAHMI', 'Kelas 3 A', 'laki-laki', '081314885343', 'TANJUNG BARAT'),
(112400091, 3362, 'SEPTIYANI LIA IMANDA', 'Kelas 3 A', 'laki-laki', '083805905583', 'JALAN RANCHO INDAH NO. 10'),
(112405417, 3306, 'ADITIYA SAPUTRA', 'Kelas 3 A', 'laki-laki', '089632424092', 'JALAN MUARA TANJUNG BARAT NO. 27'),
(112577190, 3270, 'MALIKHA NUR AZMI', 'Kelas 4 A', 'laki-laki', '085772662252', 'JL.RANCHO INDAH'),
(112660153, 3269, 'INTAN NUR SAFITRI', 'Kelas 4 A', 'perempuan', '081296855304', 'JL.GINTUNG GG.BUNI I NO.37'),
(113011073, 3271, 'MEYSYA RABIATUL PUTRI', 'Kelas 4 A', 'perempuan', '081287447252', 'JL.MUARA'),
(113167300, 3364, 'VIANDRA PRINCESSA AGUSTIAN', 'Kelas 3 A', 'laki-laki', '081291118323', 'JL.RAYA GINTUNG GG.H.NAIMIN NO.175'),
(113169610, 3359, 'RAFFLY ACHMAD FARIZI', 'Kelas 3 A', 'laki-laki', '083892695680', 'JLGINTUNG NO.31'),
(113596513, 3333, 'ZAHRAN ALVARO RAYHAN', 'Kelas 3 A', 'laki-laki', '081318304143', 'JALAN LEBAK SARI NO. 86'),
(113701768, 3335, 'AISIAH MUWAHHIDAH', 'Kelas 3 A', 'perempuan', '08996343170', 'JL.NANGKA MASJID AL HIKMAH NO.70'),
(113703563, 3332, 'SYAHWAL SEPTIAN NUGRAHA', 'Kelas 3 A', 'laki-laki', '081316168000', 'JALAN MUARA DALAM'),
(113765061, 3322, 'MUHAMMAD ASGHA WIBISONO', 'Kelas 3 A', 'laki-laki', '089666652630', 'JALAN JATI PADANG BARU NO. 23'),
(114297949, 3259, 'AISYAH AZZAHRA', 'Kelas 4 A', 'perempuan', '081292802738', 'JL.TANJUNG BARAT NO.28'),
(114300653, 3338, 'ALESHA KANYA PRATISTHA', 'Kelas 3 A', 'perempuan', '0817848947', 'JL.JAMBU II NO. 54'),
(114425688, 3330, 'SEFFINAH NUR FITRIYAH', 'Kelas 3 A', 'laki-laki', '089662074199', 'TANJUNG BARAT'),
(114445780, 3363, 'SYIRA AULIA PUTRI', 'Kelas 3 A', 'perempuan', '', 'TANJUNG BARAT GG.CANGKRING 1'),
(114454539, 3308, 'ALMA NAURAH AGUSPRIANA', 'Kelas 3 A', 'perempuan', '089656284252', 'JALAN LEBAK SARI'),
(114639619, 3261, 'AMIRAH FAJRIAH WAHYUDIN', 'Kelas 4 A', 'perempuan', '087858229495', 'JL.TANJUNG BARAT'),
(115164902, 3279, 'PUTRI NABILAH GANES', 'Kelas 4 A', 'perempuan', '085718578495', 'JL.GINTUNG'),
(115214781, 3283, 'RIFQY RAFHANSYAH', 'Kelas 4 A', 'laki-laki', '083841477105', 'JL.RANCHO INDAH DALAM'),
(115269662, 3325, 'NUKE NATASYA AZAHRA', 'Kelas 3 A', 'perempuan', '081290297426', 'JALAN LEBAK SARI'),
(115352602, 3347, 'KEZYA PUTRI ANDRIA', 'Kelas 3 A', 'perempuan', '089662384620', 'TANJUNG BARAT GG.H.M.NIPIN NO.101'),
(115453581, 3303, 'MUHAMMAD UMAIR NASHRULLAH', 'Kelas 4 A', 'laki-laki', '', 'Jl.Rancho Indah No.9 Rt.002/002'),
(115489967, 3284, 'SABRYNA KHOIRUNNISYAH', 'Kelas 4 A', 'perempuan', '085716493015', 'JL.RANCHO INDAH DALAM'),
(115721214, 3334, 'ZIFANA LATISA', 'Kelas 3 A', 'perempuan', '081288544782', 'TANJUNG BARAT'),
(115767757, 3357, 'RAFA ABIYU PRAMUDYA', 'Kelas 3 A', 'laki-laki', '0895623319954', 'JALAN MUARA'),
(115887087, 3318, 'KIRANA SHAFA RINJANI', 'Kelas 3 A', 'perempuan', '087881145599', 'JL GG SERATUS TANJUNG BARAT'),
(116464952, 3275, 'NADHIFA FIRZA', 'Kelas 4 A', 'perempuan', '081808589229', 'JL.TANJUNG BARAT'),
(116583284, 3326, 'RADIT SALMAN KURNIAWAN', 'Kelas 3 A', 'laki-laki', '081206277497', 'JL. RANCHO INDAH'),
(116695253, 3337, 'ALBY FITRA LUTHFI', 'Kelas 3 A', 'laki-laki', '', 'JL.H.SAIRIH TANJUNG BARAT'),
(116876565, 3354, 'NENO LUVIA HUSNA', 'Kelas 3 A', 'laki-laki', '081296556040', 'JL. MUARA TANJUNG BARAT NO.3'),
(116882146, 3268, 'HAVIZKI AL RUYAN', 'Kelas 4 A', 'laki-laki', '088212619418', 'JL.MUARA'),
(116953187, 3358, 'RAFAEL TIMOTI PATTIPEILOHY', 'Kelas 3 A', 'laki-laki', '081384514794', 'JALAN MESJID AL-HIDAYAH'),
(117005368, 3324, 'NAUFAL ZAHRAN PRAMUDYA', 'Kelas 3 A', 'laki-laki', '085692972047', 'TANJUNG BARAT'),
(117108001, 3346, 'JUNA ASKA ZAKARIA', 'Kelas 3 A', 'laki-laki', '083115566644', 'JALAN MUARA'),
(117183585, 3307, 'AHMAD SYAHIR', 'Kelas 2 A', 'laki-laki', '081517849732', 'Jl.H.Muhiyin NO.18'),
(117235715, 3329, 'SECHA SULTANA YAHYA ILYAS', 'Kelas 3 A', 'laki-laki', '08991609081', 'KAMPUNG MUARA'),
(117267789, 3319, 'MOCHMAD ALFA RIZKY SULAEMAN', 'Kelas 3 A', 'laki-laki', '085714408161', 'JALAN TANJUNG BARAT'),
(117401160, 3274, 'MUHAMMAD ZHILAL RABBANI', 'Kelas 4 A', 'laki-laki', '08986417531', 'JL.CANGRING 2'),
(117618566, 3317, 'KANAYA PUTRI SACHRONI', 'Kelas 3 A', 'perempuan', '081546041799', 'TANJUNG BARAT'),
(117664709, 3349, 'MUHAMAD FIRLY SABIQ', 'Kelas 3 A', 'laki-laki', '089637290323', 'JL.MUARA NO.50'),
(117738095, 3336, 'AJI DWI SANTOSO', 'Kelas 3 A', 'laki-laki', '085885720991', 'JL. MUARA TANJUNG BARAT'),
(117761837, 3282, 'RIFQI IZZATUL AZHAR', 'Kelas 4 A', 'laki-laki', '089677848126', 'JL.MUARA DALAM'),
(117764530, 3361, 'SALSABILLAH PUTRI CHANIAGO', 'Kelas 3 A', 'perempuan', '', 'JALAN MUARA NO.5'),
(117974871, 3360, 'SAHBRI RACHMANSYAH', 'Kelas 3 A', 'laki-laki', '083867041550', 'TANJUNG BARAT NO.37'),
(118342323, 3355, 'NUGIE AZRIANSYAH', 'Kelas 3 A', 'laki-laki', '081295074416', 'TANJUNG BARAT'),
(118393424, 3351, 'NATASYA', 'Kelas 3 A', 'perempuan', '081388864752', 'JL.RANCHO INDAH TANJUNG BARAT NO.33'),
(118489679, 3276, 'NADIRAH AUFA SAFANA', 'Kelas 4 A', 'perempuan', '085714408161', 'JL.MUARA'),
(118676492, 3272, 'MUHAMMAD IRFAN', 'Kelas 4 A', 'laki-laki', '08888588175', 'JL.RANCHO INDAH NO.23A'),
(118738185, 3315, 'HUMAIROH KHOIROTUN NIKMAH', 'Kelas 3 A', 'laki-laki', '083872615136', 'JALAN MUARA TANJUNG BARAT NO. 6A'),
(118933754, 3285, 'SADIRA NURUL ZAFIRA', 'Kelas 4 A', 'perempuan', '089608004961', 'JL.NANGKA GG.LANGGAR'),
(119065012, 3310, 'ANNISA MAURAKANAYA RAHMAN', 'Kelas 3 A', 'perempuan', '081818723300', 'JALAN LEBAK SARI'),
(119230315, 3323, 'MUHAMMAD PUTRA NURIZKI', 'Kelas 3 A', 'laki-laki', '082112857708', 'JALAN MUARA NO. 2 A'),
(119278494, 3320, 'MUHAMAD ARBA', 'Kelas 3 A', 'laki-laki', '', 'TANJUNG BARAT'),
(119453645, 3321, 'MUHAMAD RIFAIZ', 'Kelas 3 A', 'laki-laki', '', 'TANJUNG BARAT'),
(119546442, 3442, 'ALFANA MISYA KIRANIA', 'Kelas 3 A', 'perempuan', '', 'JL. BAU MASSEPE NO. 414'),
(119606763, 3352, 'NAURA MALIKA BATRISYIA AFIFAH', 'Kelas 3 A', 'perempuan', '087785616141', 'JALAN RANCHO INDAH NO. 31A'),
(119672415, 3345, 'HAYKAL RHAMADHAN ARDYANSHA', 'Kelas 3 A', 'laki-laki', '089106397339', 'JALAN MUARA NO.42'),
(119880378, 3280, 'RAFAEL THIMOTY NAHAMPUN', 'Kelas 4 A', 'laki-laki', '081316366510', 'JL.BUNI TANJUNG BARAT'),
(121176920, 3385, 'ARKA TAUFIK MAULANA', 'Kelas 2 A', 'laki-laki', '088224966122', 'JL RANCHO INDAH TJ. BARAT'),
(122323578, 3331, 'SITI NUR FADILLAH', 'Kelas 3 A', 'perempuan', '081372508729', 'JALAN MUARA'),
(122395195, 3412, 'SHEFIANA ANNALEE', 'Kelas 2 A', 'perempuan', '0895411748768', 'TANJUNG BARAT'),
(123387795, 3438, 'TAZYA HAURA QANITAH', 'Kelas 2 A', 'perempuan', '0895703117122', 'JL.TANJUNG BARAT'),
(123883200, 3428, 'NAILAH PUTRI IRAWAN', 'Kelas 2 A', 'laki-laki', '081906780709', 'JL.TANJUNG BARAT'),
(124055388, 3425, 'REVAN OCTARA', 'Kelas 2 A', 'laki-laki', '087883542069', 'JL.TB SIMATUPANG'),
(124673682, 3373, 'SITI ATHIFA JANEETA', 'Kelas 3 A', 'perempuan', '', 'JL. ASSAKINAH III'),
(125007700, 3427, 'NIZAM JOHRIL ADHANAQI', 'Kelas 2 A', 'laki-laki', '089684359640', 'JL.GINTUNG NO.30'),
(125525169, 3500, 'RIHADHATUL AISYA', 'Kelas 1 A', 'laki-laki', '085780218094', 'Gintung'),
(126527035, 3372, 'ABIYYU NAUFAL AMARIS', 'Kelas 3 A', 'laki-laki', '087776150708', 'JL RANCHO INDAH'),
(126628264, 3426, 'KINAYA RIZQIANURI', 'Kelas 2 A', 'laki-laki', '085779903234', 'JL BACANG NO 48'),
(128136498, 3415, 'RAYYAN BINTANG PRIYADI', 'Kelas 2 A', 'laki-laki', '083891381155', 'TANNJUNG BARAT'),
(129680496, 3418, 'ABDUL ZAMIR FIRJATULAH', 'Kelas 2 A', 'laki-laki', '0895610514232', 'JL BUNI'),
(129987980, 3316, 'IGHA TANAYA', 'Kelas 3 A', 'perempuan', '', 'TANJUNG BARAT'),
(131300397, 3465, 'Riearga Sumarihon Sipayung', 'Kelas 1 A', 'laki-laki', '081281701441', 'Jl. Muara No.21'),
(131478863, 3459, 'NUR AZIZAH', 'Kelas 1 A', 'perempuan', '089528603949', 'JL. TANJUNG BARAT'),
(132559469, 3464, 'RAISYA PUTRI AZZAHRA', 'Kelas 1 A', 'perempuan', '089604194601', 'JL. TANJUNG BARAT SELATAN'),
(133155174, 3489, 'HANSA ATHAYA', 'Kelas 1 A', 'perempuan', '085810436941', 'JL.RANCHO DALAM GG.HJ.MUHAJIRIN'),
(133310488, 3458, 'NAUFAL MITZA NUR AQILAH', 'Kelas 1 A', 'perempuan', '081317978856', 'TANJUNG BARAT'),
(134207854, 3477, 'AHMAD YUSUF', 'Kelas 1 A', 'laki-laki', '089501931223', 'JL H.MUHYIN NO 15'),
(134416605, 3494, 'Muhammad Alvino', 'Kelas 1 A', 'laki-laki', '088212966535', 'JL..GUNUK NO.17'),
(136482077, 3468, 'SALSABILA AZIZAH SALIM', 'Kelas 1 A', 'perempuan', '081241837789', 'GINTUNG'),
(136534618, 3471, 'SULTAN ACHMAD BIL FAQIH', 'Kelas 1 A', 'laki-laki', '0895365438571', 'RANCHO INDAH DALAM NO.63B'),
(136818411, 3502, 'SCRIBBIE CHANDHEA WAHYUDI', 'Kelas 1 A', 'laki-laki', '087872034301', 'RANCHO INDAH DALAM'),
(136983059, 3448, 'ANNISA NURVIANI', 'Kelas 1 A', 'perempuan', '083806204285', 'GINTUNG'),
(138064040, 3491, 'JASMINE AMIRA CALISTA', 'Kelas 1 A', 'perempuan', '0822113027614', 'JL.GINTUNG RANCHO INDAH NO.62'),
(139449309, 3495, 'MUHAMMAD AZKA ARDANA', 'Kelas 1 A', 'laki-laki', '085697284969', 'JL, GINTUNG GG. H. SAIMIH'),
(139725815, 3481, 'ARIEL RAHMADAN', 'Kelas 1 A', 'laki-laki', '089636730988', 'JL. MUARA'),
(139769495, 3505, 'WARDAH NURJANAH', 'Kelas 1 A', 'laki-laki', '085716493035', 'JL GINTUNG '),
(139914570, 3449, 'ASIAH ALWAHDANIYAH', 'Kelas 1 A', 'perempuan', '0895332114808', 'JL RANCHO INDAH DALAM'),
(2147483647, 3443, 'Adelia Rasty', 'Kelas 2 A', 'perempuan', '081316421995', 'JL. RANCHO INDAH');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `feedback_layanan`
--
ALTER TABLE `feedback_layanan`
  ADD PRIMARY KEY (`id_feedback`);

--
-- Indeks untuk tabel `feedback_sarana`
--
ALTER TABLE `feedback_sarana`
  ADD PRIMARY KEY (`id_feedback`);

--
-- Indeks untuk tabel `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indeks untuk tabel `kepalasekolah`
--
ALTER TABLE `kepalasekolah`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `layanan`
--
ALTER TABLE `layanan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indeks untuk tabel `sarana`
--
ALTER TABLE `sarana`
  ADD PRIMARY KEY (`id_sarana`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
