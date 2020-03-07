package com.aurama.aplikasiandroid.fragment.model;

import com.aurama.aplikasiandroid.fragment.R;

import java.util.ArrayList;

public class ClubsData {
    private static String[] clubName = {
            "Manchester United",
            "Manchester City",
            "Chelsea",
            "Arsenal",
            "Liverpool",
            "Totttenham Hotsput",
            "Everton",
            "Burnley",
            "Leicester City",
            "Newcastle United",
            "Southampton",
            "Wolves"
    };

    private static String[] clubInfo = {
            "Manchester United adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.\n" +
                    "Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris.\n" +
                    "Bencana Udara München 1958 merenggut nyawa delapan pemain. Pada tahun 1968, di bawah manajemen Matt Busby, Manchester United adalah klub sepak bola Inggris pertama yang memenangkan Piala Eropa. sedangkan Alex Ferguson memenangkan total 38 gelar utama, dari bulan November 1986 sampai Mei 2013, ketika ia mengumumkan pensiun setelah 26 tahun di klub. Rekan Scot David Moyes diangkat sebagai penggantinya pada tanggal 9 Mei 2013.\n" +
                    "Manchester United adalah klub sepak bola terkaya ketiga di dunia untuk 2011-12 dalam hal pendapatan, dengan pendapatan tahunan sebesar €395.9 juta, dan kedua klub paling berharga tahun 2013, senilai $3.165 miliar. Dan pada bulan Januari 2015 lalu, Manchester United dinobatkan sebagai klub terkaya kedua di dunia, Ini adalah salah satu tim sepak bola yang paling banyak didukung di dunia. Setelah sahamnya tercatat di London Stock Exchange pada tahun 1991, klub itu dibeli oleh Malcolm Glazer pada Mei 2005 di kesepakatan menilai klub di hampir £800 juta. Pada bulan Agustus 2012, Manchester United melakukan penawaran umum perdana di Bursa Efek New York.",
            "Manchester City adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester.\n" +
                    "Pertandingan pertama dimainkan pada bulan November 1880. Pada saat itu masih bernama St Mark's (West Gorton). Pada tahun 1887 berubah nama menjadi Ardwick A.F.C, dan pada tahun 1894 menjadi Manchester City F.C.\n" +
                    "Manchester City telah memenangi Liga Inggris sebanyak 4 kali, Piala FA 5 kali, Piala Liga Inggris 4 kali, dan Piala Winners Eropa 1 kali. Periode tersukses klub ini terjadi pada era akhir tahun 1960-an dan awal 1970-an. Pada saat itu City di bawah asuhan manager Joe Mercer dengan asistennya Malcolm Allison dan beberapa pemain seperti Colin Bell, Mike Summerbee dan Francis Lee.\n" +
                    "Pada awal tahun 1980-an City mengalami masa penuh gejolak penurunan yang berpuncak pada degradasi ke tingkat ketiga sistem liga sepak bola Inggris pada tahun 1998 untuk pertama kalinya dalam sejarah mereka. Pada saat era Liga Primer Inggris pertama kali dibentuk tahun 1992, City adalah salah satu pencetus liga premier untuk pertama kali. Namun, prestasi klub ini tidak kunjung membaik, bahkan City harus terdegradasi kembali ke tingkat kedua hingga 2 kali, sementara di ajang Piala FA sejak bergulirnya Liga Primer Inggris, prestasi terbaik City hanya sampai pada perempat-final.\n" +
                    "Setelah mengakhiri liga di musim 2006-07 pada posisi empatbelas, musim berikutnya prestasi klub mulai merangkak naik. Pertengahan tahun 2007 klub ini resmi menjadi milik milyarder asal Thailand yang ambisius dan juga adalah mantan Perdana Menteri Thailand, Thaksin Shinawatra. Namun, kepemilikan Thaksin tidak berlangsung lama dikarenakan tuduhan kasus korupsi di negeranya, akhirnya pada September 2008 Thaksin menjual kepemilikan klub kepada pengusaha yang juga anggota keluarga kerajaan Abu Dhabi, Uni Emirat Arab yaitu Sheikh Mansour bin Zayed Al Nahyan.\n" +
                    "Sheikh Mansour bin Zayed Al Nahyan kemudian menghabiskan ratusan jutaan poundsterling untuk membeli pemain kelas atas agar klub menjadi kompetitif. Sukses menyusul pada tahun 2011, Manchester City lolos ke Liga Champions UEFA dan memenangkan Piala FA. Keberhasilan ini mencapai puncaknya dengan menjuarai Liga Premier Inggris 2011-12.",
            "Chelsea adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.\n" +
                    "Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960an, 1970an, 1990an, dan 2000an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, satu Liga Champions UEFA, dan satu Piala Super UEFA. Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lebih dari 30 gelar sejak tahun 1997, termasuk untuk pertama kali meraih gelar ganda, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan Liga Eropa UEFA pada 2013 dan 2019.\n" +
                    "Kostum utama Chelsea adalah kaus dan celana berwarna biru royal dengan kaus kaki berwarna putih. Kombinasi tersebut telah digunakan sejak dekade 1960an. Lambang klub telah berganti beberapa kali dalam upaya memodernisasi dan mengubah pencitraan. Lambang yang kini digunakan, yang menampilan seekor singa seremonial memegang sebuah tongkat, merupakan modifikasi dari lambang yang pernah digunakan pada dekade 1950an. Sejak tahun 2003, Chelsea dimiliki oleh Roman Abramovich seorang miliuner asal Rusia. Pada tahun 2016, Chelsea mendapat peringkat ketujuh klub sepak bola paling bernilai di dunia versi majalah Forbes, senilai £1.15 miliar ($1.66 miliar). Rata-rata jumlah penonton liga pada laga kandang musim 2016–17 sebanyak 41.507 penonton, jumlah tertinggi keenam di Liga Utama Inggris.",
            "Arsenal adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 13 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen Liga Inggris sepanjang abad ke-20. Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan.\n" +
                    "Arsenal didirikan pada 1886 di Woolwich dan pada tahun 1893 menjadi klub pertama dari selatan Inggris untuk bergabung dengan Football League. Pada tahun 1913, hal itu bergerak ke utara melintasi kota Stadion Arsenal di Highbury. Pada 1930, klub telah memenangkan lima gelar Liga Championship dan dua Piala FA. Setelah periode bersandar pada tahun-tahun pasca-perang itu memenangkan Liga dan Piala FA ganda, di musim 1970-71, dan pada 1990-an dan dekade pertama abad ke-21 memenangkan dua gelar ganda dan mencapai Final Liga Champions UEFA 2006.\n" +
                    "Arsenal memiliki persaingan lama dengan tim sesama London Utara Tottenham Hotspur, dengan kontes Derby London Utara. Arsenal adalah klub sepak bola terkaya keempat di dunia pada tahun 2013, senilai lebih dari $13 miliar. Di kancah Premier League, Arsenal termasuk salah satu tim yang tidak pernah terdegradasi. Arsenal merupakan tim sepak bola pertama yang memperkenalkan penggunaan angka pada jersey.",
            "Liverpool adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara bertahan Liga Champions UEFA musim 2018-2019\n" +
                    "Liverpool telah memenangkan 6 trofi Liga Champions UEFA (dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah Real Madrid dan AC Milan. Selain itu Liverpool juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA.\n" +
                    "Di kompetisi domestik, Liverpool adalah klub dengan 18 gelar juara Liga Inggris, 7 Piala FA, serta 7 kali juara Piala Liga.\n" +
                    "Liverpool didirikan pada tahun 1892 dan bergabung dengan Football League pada tahun berikutnya. Klub ini telah bermain di Stadion Anfield sejak pembentukannya yang terletak sekitar 4,8 km dari pusat kota Liverpool.\n" +
                    "Periode paling sukses dalam sejarah Liverpool adalah pada tahun 1970-an dan 1980-an ketika Bill Shankly dan Bob Paisley memimpin klub dengan sebelas gelar liga dan tujuh piala Eropa.\n" +
                    "Liverpool memiliki sejarah persaingan yang panjang dengan klub tetangganya Everton dan juga dengan Manchester United. Persaingan dengan klub sekota terkenal dengan nama Derby Merseyside. Sedangkan dengan Manchester United di kenal dengan sebutan North West Derby.\n" +
                    "Liverpool dikenal memiliki suporter yang sangat fanatik di seluruh dunia. Mereka dijuluki The Kop. Lagu kebangsaan Liverpool adalah You'll Never Walk Alone.\n" +
                    "Dalam sepanjang sejarah Premiere League, Liverpool termasuk salah satu dari enam tim yang belum pernah terdegradasi.",
            "Tottenham Hotspur adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih.\n" +
                    "Didirikan pada tahun 1882, Tottenham memenangkan Piala FA untuk pertama kalinya pada tahun 1901, dan menjadi satu-satunya klub non-Liga yang menjuarai Piala FA, sejak dibentuknya The Football League. Pada musim 1960-61, Tottenham adalah klub pertama pada abad ke-20 yang meraih gelar ganda sebagai juara Liga dan Piala FA. Setelah berhasil mempertahankan Piala FA pada tahun 1962, Tottenham menjadi klub Inggris pertama yang memenangkan kompetisi klub UEFA dengan menjadi juara Piala Winners UEFA pada tahun 1963. Piala FA yang ketiga kalinya pada tahun 1960-an, dimenangkan pada tahun 1967.\n" +
                    "Pada 1970-an, Tottenham memenangkan dua Piala Liga yaitu pada tahun 1971 dan 1973. Pada tahun 1972, menjadi klub pertama yang menjadi juara Piala UEFA sejak dibentuk pada tahun 1971 dan menjadi klub Inggris pertama yang memenangkan dua piala utama Eropa yang berbeda. Pada 1980-an, Spurs memenangkan beberapa piala dengan Piala FA sebanyak dua kali, FA Community Shield dan Piala UEFA pada tahun 1984. Pada 1990-an, klub memenangkan Piala FA dan Piala Liga. Ketika memenangkan Piala Liga sekali lagi pada tahun 2008, menjadikan mereka klub yang telah memenangkan trofi utama di setiap enam dekade terakhir - sebuah prestasi yang sama dengan Manchester United.\n" +
                    "Klub ini bermarkas di Stadion Tottenham Hotspur Motto dari klub ini adalah Audere est Facere yang merupakan bahasa Latin yang sering diterjemahkan ke dalam bahasa Inggris sebagai To Dare is To Do. Spurs memiliki perseteruan yang cukup tua dengan klub sekota, Arsenal, dan pertandingan antara Spurs dengan Arsenal terkenal dengan nama Derby London Utara.",
            "Everton adalah sebuah klub sepak bola profesional yang bermarkas di Kota Liverpool, Inggris, dan merupakan klub rival dari klub sekota Liverpool. Didirikan pada tahun 1878 dan menjadi salah satu pendiri dari Liga Sepak Bola (Football League) pada tahun 1888 serta Liga Primer pada tahun 1992.\n" +
                    "Saat ini berkompetisi di Liga Utama Inggris, divisi teratas Liga Inggris. Mereka telah berkompetisi di divisi teratas dengan rekor 108 musim, menjadi klub yang paling lama bermain di divisi teratas kompetisi sepak bola Inggris.",
            "Burnley FC adalah sebuah klub sepak bola Inggris yang bermarkas di Burnley, Lancashire. Klub ini sedang bermain di Liga Utama Inggris, kasta tertinggi sepak bola inggris di musim 2016-17 setelah memenangkan liga peringkat kedua yaitu Liga Championship Inggris di musim sebelumnya. Klub ini memainkan pertandingan kandangnya di stadion Turf Moor yang berkapasitas 22.546 penonton. Seragam mereka adalah berwarna nila, sehingga mereka dijuluki Clarets. Klub ini adalah salah satu anggota penemu English Football League pada tahun 1888.\n" +
                    "Burnley pernah dua kali menjadi juara Liga Inggris Divisi Pertama, di musim 1920–21 dan 1959–60, pernah memenangkan Piala FA sekali, pada tahun 1914, dan pernah memenangkan Community Shield dua kali, di 1960 dan 1973.",
            "Leicester City adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton.\n" +
                    "Mereka bermain di Liga Premier, setelah promosi sebagai juara Football League Championship di 2013-14, kembali ke papan atas sepak bola Inggris setelah satu dekade dan akhirnya menjadi juara di musim 2015-16, atau dua musim setelah promosi.\n" +
                    "Leicester dipastikan keluar sebagai juara untuk kali pertama dalam sejarahnya setelah raihan poinnya tak mampu dikejar Arsenal maupun Tottenham diposisi kedua dan ketiga.\n" +
                    "Seragam mereka berwarna biru dan celana putih. Klub ini kini berlaga di Liga Utama Inggris. Tim ini didirikan tahun 1884, dengan nama klub Leicester Fosse, yang bermain di sebuah lapangan dekat Fosse Road. Mereka pindah ke jalan Filbert pada tahun 1891, dan mulai masuk ke Football League pada tahun 1894 dan mengadopsi nama Leicester City pada tahun 1919. Mereka pindah ke Stadion Walkers pada tahun 2002, yang berganti nama menjadi Stadion King Power setelah perubahan kepemilikan di 2011.\n" +
                    "Leicester memenangkan Premier League 2015-16, juara untuk kali pertama dalam sejarah mereka di kompetisi teratas liga inggris. Sebelum ini, capaian prestasi tertinggi yang pernah mereka raih adalah duduk di tempat kedua di Divisi Satu tahun 1928-29. Klub ini total mengkoleksi tujuh gelar lapis kedua. ( 6 Divisi II dan satu Championship), serta satu gelar League One. Mereka juga telah memenangkan Piala Liga tiga kali dan telah Piala FA runner-up empat kali, sebuah rekor tampil di final tanpa memenangkan kompetisi. Pemain andalan mereka seperti Kante, Jamie Vardy, Riyad Mahrez, dan Kasper Schmeicel lah yang berhasil membawa The Foxes mengukir sejarah dengan menjadi juara Liga Inggris untuk pertama kalinya.",
            "Newcastle United adalah klub sepak bola profesional Inggris yang berbasis di Newcastle upon Tyne, dan bermain di Liga Utama Inggris, kompetisi tingkat teratas dalam sepak bola Inggris. Newcastle United didirikan pada tahun 1892 sebagai hasil penggabungan Newcastle East End dan Newcastle West End, dan bermain di kandangnya saat ini, St James' Park, sejak saat itu. Stadion tersebut dikembangkan menjadi stadion all-seater pada pertengahan 1990-an dan memiliki kapasitas 52.354.\n" +
                    "Klub ini telah menjadi peserta Liga Utama Inggris untuk semua musim kecuali dalam tiga tahun sejarah kompetisi, dengan menghabiskan 85 musim di tingkat teratas per Mei 2016, dan tidak pernah turun di bawah tingkat kedua kasta sepak bola Inggris sejak bergabung dengan Football League pada tahun 1893. Mereka telah memenangkan empat gelar Kejuaraan Liga, enam Piala FA, dan sekali Community Shield, serta Inter-Cities Fairs Cup 1969, dan Piala Intertoto UEFA 2006. Newcastle United memiliki jumlah total trofi tertinggi kesembilan yang dimenangkan oleh sebuah klub Inggris.[4] Periode tersukses klub adalah antara 1904 hingga 1910, ketika mereka memenangkan Piala FA dan tiga gelar Divisi Pertama. Klub ini sangat sukses di Liga Utama pada 1990-an dan awal 2000-an tanpa memenangkan piala, tetapi telah banyak berjuang di papan bawah sejak musim 2006–07, dan terdegradasi pada tahun 2009 dan 2016. Mereka kembali ke Liga Utama untuk musim 2017–18 setelah memenangkan gelar Kejuaraan EFL pada tahun sebelumnya.\n" +
                    "Seragam mereka berwarna hitam-putih, celana pendek hitam dan kaus kaki hitam. Lambang tradisional mereka mengambil elemen-elemen dari lambang kota tersebut, yang memiliki dua kuda laut.",
            "Southampton merupakan sebuah tim sepak bola Inggris yang didirikan tahun 1898. Bermarkas di Stadion St Mary's, Southampton, Hampshire, Southampton pada musim 2011-12 bermain di Football League Championship. Southampton juga dikenal sebagai akademi sepak bola Liverpool.",
            "Wolverhampton Wanderers Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Wolverhampton, Britania Raya yang bermain di Liga Utama Inggris. Klub ini memainkan pertandingan kandangnya di Stadion Molineux yang berkapasitas 32,050 penonton. Seragam mereka berwarna cokelat-hitam. Mereka dijuluki Wolves."
    };

    private static int[] clubImage = {
            R.drawable.manchesterunited,
            R.drawable.manchestercity,
            R.drawable.chelsea,
            R.drawable.arsenal,
            R.drawable.liverpool,
            R.drawable.tottenham,
            R.drawable.everton,
            R.drawable.burnley,
            R.drawable.leicester,
            R.drawable.newcastle,
            R.drawable.southampton,
            R.drawable.wolves
    };

    public static ArrayList<Clubs> getListData() {
        ArrayList<Clubs> list = new ArrayList<>();

        for (int i = 0; i < clubName.length; i++) {
            Clubs clubs = new Clubs();
            clubs.setName(clubName[i]);
            clubs.setInfo(clubInfo[i]);
            clubs.setImage(clubImage[i]);
            list.add(clubs);
        }
        return list;
    }
}
