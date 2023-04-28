package com.codingwithmitch.kotlinrecyclerviewexample

import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "PANTAI 9!",
                    "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                    "https://genpi.id/wp-content/uploads/2020/02/Sembilan-Beach-Sumenep-Madura-kakpj.jpg",
                    "Sebelum terkenal menjadi nama yang sekarang, dulunya bernama Pantai Mareddnan. Arti bahasa madura Mareddnan dalam bahasa Indonesia adalah ‘kuburan’.\n" +
                            "\n" +
                            "Karena tepat bersebelahan dengan kompleks pemakaman umum. Namun sekarang sudah ada tembok yang memberi sekat. Sehingga tidak lagi terlihat angker, mistis, dan seram.\n" +
                            "\n" +
                            "Untuk menghilang kesan tersebut pula, pihak pemerintah setempat mengubah namanya menjadi Pantai Sembilan."
                )
            )
            list.add(
                BlogPost(
                    "MASJID JAMIK",
                    "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                    "https://static.republika.co.id/uploads/images/xlarge/masjid-agung-sumenep-termasuk-dalam-area-keraton_221029194056-980.jpg",
                    "MASJID"
                )
            )

            list.add(
                BlogPost(
                    "MUSIUM",
                    "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                    "http://humaiz.it.student.pens.ac.id/assets/img/museum/museum3-l.jpg",
                    "MUSIUM"
                )
            )
            list.add(
                BlogPost(
                    "taman tajamara)",
                    "Vasiliy has been a freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                    "https://radarmadura.jawapos.com/wp-content/uploads/2019/04/jika-mujur-penonton-launching-taman-tajamara-berpeluang-raih-hadiah_m_132863.jpg",
                    "TAMAN"
                )
            )
            list.add(
                BlogPost(
                    "ADI PODAY SUMENP",
                    "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                    "https://fastly.4sqi.net/img/general/600x600/35481834_JRoJZPwOPCwL22VMVxisMuUlrj4QEAlGzVBFyy1Ht20.jpg",
                    "GEDUNG"
                )
            )
            list.add(
                BlogPost(
                    "PULAU OKSIGEN",
                    "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                    "https://akcdn.detik.net.id/community/media/visual/2022/03/18/jelajah-nusa-6_169.jpeg?w=700&q=90",
                    "oksigeN"
                )
            )
            list.add(
                BlogPost(
                    "PULAI KAGEAN",
                    "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                    "https://cdns.klimg.com/merdeka.com/i/w/news/2020/03/03/1152459/content_images/670x335/20200303172009-1-pulau-kangean-001-rizka-muallifa.jpg",
                    "PULAU"
                )
            )
            list.add(
                BlogPost(
                    "GILI LABAK ",
                    "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                    "https://cdn.nativeindonesia.com/foto/gili-labak/menikmati-keindahan-Gili-Labak.jpg",
                    "PULAU"
                )
            )
            list.add(
                BlogPost(
                    "SUMENEP",
                    "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                    "https://cdn1-production-images-kly.akamaized.net/8Uns1RYVmrjpjxoAzMr6NibaCvw=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1669345/original/002114100_1501876126-20170805-salam_pagi-boekit_tinggi2-sumenep.jpg",
                    "KECAMATAN"
                )
            )
            return list
        }
    }
}