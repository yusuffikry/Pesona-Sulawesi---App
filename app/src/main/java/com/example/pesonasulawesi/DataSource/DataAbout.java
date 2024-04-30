package com.example.pesonasulawesi.DataSource;

import com.example.pesonasulawesi.Account.AccountAbout;
import com.example.pesonasulawesi.R;

import java.util.ArrayList;

public class DataAbout {

    public static ArrayList<AccountAbout> abouts = generateDummyChats();

    private static ArrayList<AccountAbout> generateDummyChats() {
        ArrayList<AccountAbout> abouts = new ArrayList<>();
        abouts.add(new AccountAbout("Sulawesi Selatan", "Top 5 Destination in Sulawesi Selatan", "1. Bulukumba", "2. Tana Toraja",
                "3. Taman Nasional Bantimurung Maros", "4. Pulau Samalona", "5. Hutan Mangrove Tongkoe",
                "Pantai Tanjung Bira adalah salah satu pantai terindah di Sulawesi Selatan. Pantai ini terkenal dengan pasir putihnya yang halus, air lautnya yang jernih, dan pemandangan matahari terbenam yang menakjubkan. Di sini, Anda dapat berenang, berjemur, snorkeling, diving, atau simply bersantai di tepi pantai."
        , "Tana Toraja adalah sebuah dataran tinggi di Sulawesi Selatan yang terkenal dengan budaya dan tradisi yang unik. Di sini, Anda dapat melihat rumah-rumah Tongkonan yang khas, kuburan yang digantung di tebing, dan upacara Rambu Solo' yang sakral.",
                "Taman Nasional Bantimurung Maros adalah taman nasional yang terletak di Kabupaten Maros, Sulawesi Selatan. Taman nasional ini terkenal dengan air terjunnya yang indah, gua-gua yang misterius, dan flora dan fauna yang beragam. Di sini, Anda dapat trekking, hiking, caving, atau simply menikmati keindahan alam.",
                "Pulau Samalona adalah sebuah pulau kecil yang terletak di lepas pantai Makassar. Pulau ini terkenal dengan pantainya yang indah, air lautnya yang jernih, dan terumbu karang yang masih alami. Di sini, Anda dapat snorkeling, diving, atau simply bersantai di tepi pantai." ,
                "Hutan Mangrove Tongke-Tongke adalah hutan bakau yang terletak di Kabupaten Pangkep, Sulawesi Selatan. Hutan bakau ini adalah rumah bagi berbagai jenis flora dan fauna, termasuk burung, ikan, dan reptil. Di sini, Anda dapat menyusuri hutan bakau dengan perahu, melihat monyet kra, atau simply menikmati udara segar." ,
                R.drawable.icon_sulsel, R.drawable.bulukumba_image1, R.drawable.tana_toraja, R.drawable.taman_wisata_bantimurung, R.drawable.pulau_samalona, R.drawable.hutan_mangrove));

        abouts.add(new AccountAbout("Gorontalo", "Top 5 Destination in Gorontalo", "1. Pulau Saronde", "2. Taman Laut Olele",
                "3.  Air Terjun Permai Taludaa", "4. Pantai Ratu", "5. Wisata Hiu Paus Botubarani",
                "•  Pulau kecil yang indah dengan pantai berpasir putih, air laut biru jernih, dan terumbu karang yang masih alami. \n" +
                        "•  Cocok untuk snorkeling, diving, berenang, dan bersantai di tepi pantai. \n" +
                        "•  Tersedia penginapan dan restoran di pulau ini.\n."
                , "•  Surga bagi para pecinta snorkeling dan diving dengan berbagai jenis ikan dan terumbu karang yang menakjubkan. \n" +
                "•  Terletak di Pulau Saronde dan mudah diakses dengan perahu. \n" +
                "•  Pemandangan bawah laut yang indah dan beragam biota laut menjadi daya tarik utama.\n",
                "•  Air terjun bertingkat dengan kolam alami yang menyegarkan dikelilingi pepohonan rindang. \n" +
                        "•  Lokasi wisata yang asri dan alami, cocok untuk berenang, piknik, dan bersantai. \n" +
                        "•  Terletak di Desa Taludaa, Kecamatan Telaga, Kabupaten Pohuwato.\n",
                "•  Pantai berpasir putih dengan ombak yang tenang, cocok untuk berenang dan bermain air. \n" +
                        "•  Pemandangan pantai yang indah dengan pepohonan kelapa dan tebing batu yang menawan. \n" +
                        "•  Terletak di Desa Imboto, Kecamatan Tilango, Kabupaten Gorontalo\n" ,
                "•  Pengalaman unik untuk berenang bersama hiu paus raksasa di habitat aslinya. \n" +
                        "•  Hiu paus di sini jinak dan bersahabat, sehingga aman untuk berinteraksi. \n" +
                        "•  Terletak di Desa Botubarani, Kecamatan Kabila Bone, Kabupaten Bone Bolango.\n" ,
                R.drawable.icon_gorontalo, R.drawable.pulau_saronde, R.drawable.taman_laut_olele, R.drawable.air_terjun_permai_taluda, R.drawable.pantai_ratu, R.drawable.post_gorontalo));

        abouts.add(new AccountAbout("Sulawesi Utara", "Top 5 Destination in Sulawesi Utara", "1. Taman Nasional Bunaken", "2. Cagar Alam Tangkoko:",
                "3. Gunung Lokon", "4. Danau Tondano", "5. Pulau Lihaga",
                "•  Surga bagi para pecinta diving dan snorkeling dengan keanekaragaman hayati laut yang luar biasa. \n" +
                        "•  Terdiri dari 5 pulau dengan berbagai spot diving dan snorkeling yang terkenal, seperti Bunaken, Siladen, Manado Tua, Mantehage, dan Ajer Manado. \n" +
                        "•  Rumah bagi lebih dari 350 spesies terumbu karang dan 1.400 spesies ikan.\n"
                , "•  Hutan lindung yang menjadi habitat bagi berbagai spesies flora dan fauna unik, termasuk tarsius tarsier, kera Sulawesi, dan burung maleo. \n" +
                "•  Tempat wisata yang ideal bagi para pecinta alam dan pengamat burung. \n" +
                "•  Tersedia berbagai paket wisata trekking dan edukasi di Cagar Alam Tangkoko.\n",
                "•  Gunung berapi aktif yang menawarkan pemandangan alam yang menakjubkan dan pengalaman trekking yang menantang. \n" +
                        "•  Pendakian ke puncak Gunung Lokon membutuhkan waktu sekitar 4-5 jam dengan tingkat kesulitan sedang. \n" +
                        "•  Pemandangan kawah gunung berapi yang aktif dan panorama Kota Manado yang indah menjadi daya tarik utama.\n",
                "•  Danau vulkanik terbesar di Indonesia dengan pemandangan alam yang asri dan udara yang sejuk. \n" +
                        "•  Cocok untuk berbagai aktivitas wisata, seperti berperahu, memancing, dan berenang. \n" +
                        "•  Terdapat beberapa pulau kecil di tengah Danau Tondano yang dapat dikunjungi.\n" ,
                "•  Pulau kecil dengan pantai berpasir putih, air laut biru jernih, dan terumbu karang yang masih alami. \n" +
                        "•  Surga tersembunyi bagi para wisatawan yang ingin melarikan diri dari keramaian dan menikmati ketenangan alam. \n" +
                        "•  Cocok untuk snorkeling, diving, berenang, dan bersantai di tepi pantai.\n" ,
                R.drawable.icon_sulut, R.drawable.pulau_bunaken, R.drawable.cagar_alam_tangkoko, R.drawable.gunung_lokon, R.drawable.danau_tondano, R.drawable.pulau_lihaga));

        abouts.add(new AccountAbout("Sulawesi Sulawesi Tengah", "Top 5 Destination in Sulawesi Tengah", "1. Taman Nasional Lore Lindu", "2. Danau Poso",
                "3. Kepulauan Togean", "4. Air Terjun Saluopa", "5. Palu",
                "•  Taman nasional yang luas dengan berbagai flora dan fauna yang dilindungi, termasuk anoa, tarsius, dan berbagai jenis burung. \n" +
                        "•  Surga bagi para pecinta alam dan petualangan dengan berbagai pilihan trekking, hiking, dan camping. \n" +
                        "•  Pemandangan alam yang menakjubkan dengan air terjun, danau, dan pegunungan yang indah.\n"
                , "•  Danau vulkanik terbesar di Indonesia dengan air yang jernih dan pemandangan yang indah. \n" +
                "•  Cocok untuk berbagai aktivitas wisata, seperti berperahu, memancing, dan berenang. \n" +
                "•  Terdapat beberapa pulau kecil di tengah Danau Poso yang dapat dikunjungi.\n",
                "•  Kepulauan yang terdiri dari 391 pulau kecil dengan pantai berpasir putih, air laut biru jernih, dan terumbu karang yang masih alami. \n" +
                        "•  Surga bagi para pecinta diving, snorkeling, dan kayaking. \n" +
                        "•  Pemandangan bawah laut yang menakjubkan dengan berbagai jenis ikan, terumbu karang, dan biota laut lainnya.\n",
                "•  Air terjun bertingkat dengan ketinggian 75 meter yang dikelilingi oleh hutan yang rimbun. \n" +
                        "•  Pemandangan air terjun yang indah dan suasana yang asri menjadi daya tarik utama. \n" +
                        "•  Cocok untuk trekking, berenang, dan bersantai di alam.\n" ,
                "•  Ibukota provinsi Sulawesi Tengah dengan berbagai wisata budaya dan sejarah yang menarik. \n" +
                        "•  Kunjungi Museum Negeri Sulawesi Tengah untuk mempelajari sejarah dan budaya Sulawesi Tengah. \n" +
                        "•  Jelajahi Taman Budaya Palu untuk melihat berbagai pertunjukan seni dan budaya tradisional.\n." ,
                R.drawable.icon_sulteng, R.drawable.taman_nasional_lore_lindu, R.drawable.danau_poso, R.drawable.kepulauan_togean, R.drawable.air_terjun_saluopa, R.drawable.palu));

        abouts.add(new AccountAbout("Sulawesi Barat", "Top 5 Destination in Sulawesi Barat", "1. Pulau Karampuang", "2. Anjungan Pantai Manakarra",
                "3. Gonda Mangrove Park", "4. Pantai Mampie", "5. Polman Waterboom",
                "•\tSebuah pulau di propinsi Sulawesi Barat, tepatnya di kota Mamuju.\n" +
                        "•\tDiperlukan 15 menit menyebrang laut menggunakan kapal kecil dan membayar 20 per orang.\n" +
                        "•\tPulau ini dikelilingi laut dengan warna air hijau tosca dan cukup menarik untuk melakukan kegiatan snorkeling.\n"
                , "•  Terletak di Kabupaten Mamuju, pantai ini terkenal dengan pasir putihnya yang halus, air laut biru jernih, dan pemandangan yang indah. \n" +
                "•  Cocok untuk berenang, berjemur, bermain air, dan menikmati panorama laut yang menakjubkan. \n" +
                "•  Terdapat berbagai fasilitas wisata seperti gazebo, warung makan, dan toilet di sekitar pantai. \n" +
                "•  Pengunjung dapat menikmati berbagai aktivitas seperti banana boat, jet ski, dan flying fox.\n",
                "•  Taman hutan bakau yang terletak di Kabupaten Polewali Mandar. \n" +
                        "•  Menjadi rumah bagi berbagai flora dan fauna, termasuk burung, ikan, dan reptil. \n" +
                        "•  Pengunjung dapat menyusuri hutan bakau dengan perahu, melihat monyet kra, dan menikmati udara segar. \n" +
                        "•  Terdapat beberapa gazebo dan menara pandang yang memungkinkan pengunjung untuk melihat keindahan hutan bakau dari atas.\n",
                "•  Pantai berpasir putih dengan air laut biru jernih yang terletak di Kabupaten Polewali Mandar. \n" +
                        "•  Dikenal dengan ombaknya yang tenang dan cocok untuk berenang, bermain air, dan bersantai. \n" +
                        "•  Pengunjung dapat menikmati pemandangan pulau-pulau kecil di sekitarnya.\n" ,
                "Taman air yang terletak di Kabupaten Polewali Mandar.\n" +
                        "Menyediakan berbagai wahana air seru seperti kolam renang, seluncuran, dan ember tumpah.\n" +
                        "Tempat yang ideal untuk menghabiskan waktu bersama keluarga dan teman-teman." ,
                R.drawable.icon_sulbar, R.drawable.pulau_karampuang, R.drawable.anjungan_manakarra, R.drawable.gonda_mangrove_park, R.drawable.pantai_mampie, R.drawable.polman_waterboom));

        abouts.add(new AccountAbout("Sulawesi Tenggara", "Top 5 Destination in Sulawesi Tengah", "1. Taman Nasional Wakatobi", "2. Pantai Nirwana",
                "3. Benteng Keraton Buton", "4. Danau Biru Kolaka", "5. Air Terjun Moramo",
                "•  Surga bagi para pecinta diving dan snorkeling dengan keanekaragaman hayati laut yang luar biasa. \n" +
                        "•  Terdiri dari 4 pulau utama dan 12 pulau kecil dengan berbagai spot diving dan snorkeling yang terkenal, seperti Wakatobi, Tomia, Kaledupa, dan Wangi-Wangi. \n" +
                        "•  Rumah bagi lebih dari 750 spesies terumbu karang dan 4.000 spesies ikan.\n"
                , "•  Pantai berpasir putih dengan air laut biru jernih yang terletak di Teluk Kendari. \n" +
                "•  Cocok untuk berenang, berjemur, bermain air, dan menikmati pemandangan yang indah. \n" +
                "•  Terdapat berbagai fasilitas wisata seperti gazebo, warung makan, dan toilet di sekitar pantai.\n",
                "•  Benteng bersejarah yang terletak di Kota Baubau, bekas ibukota Kesultanan Buton. \n" +
                        "•  Dibangun pada abad ke-16 dan merupakan salah satu benteng terluas di Indonesia. \n" +
                        "•  Kini, benteng ini menjadi objek wisata sejarah dan budaya yang populer.\n",
                "•  Danau unik dengan air berwarna biru yang terletak di Kabupaten Kolaka Utara. \n" +
                        "•  Warna biru air danau ini disebabkan oleh kandungan mineral yang tinggi. \n" +
                        "•  Cocok untuk berenang, bersantai, dan menikmati pemandangan yang indah.\n" ,
                "•  Air terjun bertingkat yang terletak di Kabupaten Konawe Utara. \n" +
                        "•  Dikelilingi oleh hutan yang rimbun dan memiliki suasana yang asri. \n" +
                        "•  Cocok untuk trekking, berenang, dan menikmati keindahan alam.\n" ,
                R.drawable.icon_sultenggara, R.drawable.taman_nasional_wakatobi, R.drawable.pantai_nirwana, R.drawable.benteng_keraton_buton, R.drawable.danau_biru_kolaka, R.drawable.air_terjun_moramo));
        return abouts;
    }


}
