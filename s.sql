/*
SQLyog - Free MySQL GUI v5.17
Host - 5.5.27 : Database - quiz
*********************************************************************
Server version : 5.5.27
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `quiz`;

USE `quiz`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `contestant` */

DROP TABLE IF EXISTS `contestant`;

CREATE TABLE `contestant` (
  `contestant_id` int(11) NOT NULL AUTO_INCREMENT,
  `contestant_name` varchar(100) NOT NULL,
  `ques_attempted` int(11) DEFAULT NULL,
  `ques_correct` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `doa` datetime DEFAULT NULL,
  `contestant_pass` varchar(30) NOT NULL,
  PRIMARY KEY (`contestant_id`,`contestant_name`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

/*Data for the table `contestant` */

insert into `contestant` (`contestant_id`,`contestant_name`,`ques_attempted`,`ques_correct`,`score`,`doa`,`contestant_pass`) values (1,'Admin',NULL,NULL,NULL,NULL,'quiz');
insert into `contestant` (`contestant_id`,`contestant_name`,`ques_attempted`,`ques_correct`,`score`,`doa`,`contestant_pass`) values (2,'utkarsh',NULL,NULL,NULL,NULL,'utkarsh');
insert into `contestant` (`contestant_id`,`contestant_name`,`ques_attempted`,`ques_correct`,`score`,`doa`,`contestant_pass`) values (24,'u',NULL,NULL,NULL,NULL,'u');

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `q_des` varchar(500) DEFAULT NULL,
  `opt1` varchar(100) DEFAULT NULL,
  `opt2` varchar(100) DEFAULT NULL,
  `opt3` varchar(100) DEFAULT NULL,
  `opt4` varchar(100) DEFAULT NULL,
  `correct_ans` varchar(100) DEFAULT NULL,
  `sub_id` int(11) DEFAULT NULL,
  `difficulty` int(11) DEFAULT NULL,
  PRIMARY KEY (`q_id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;

/*Data for the table `question` */

insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (1,'The square root of 0.0081 is__________. ','0.09','0.9','0.91','0.009','A',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (2,'The cube root of 1331 is___________.','11','13','19','17','A',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (3,'All natural numbers and 0 are called the________numbers','whole','prime','integer','rational','A',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (4,'142 × 16 =','7222','2227','2722','2272','D',1,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (5,'4505 ÷ 5 =','901','910','190','109','A',1,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (6,'10003 – 999 =','4009','9004','9040','9400','B',1,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (7,'The least number of five digits which is completely divisible by 39','10101','10062','10016','10023','D',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (8,'What is 121 times 11?','1331','1313','1133','3131','A',1,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (9,'A car covers a distance of 200km in 2 hours 40 minutes, whereas a jeep covers the same distance in 2 hours.What is the ratio of their speed?','3:4','4:3','4:5','5:4','A',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (10,'A number is greater than 3 but less than 8. Also the number is greater than 6 but less than 10. What is the number?','5','6','7','8','C',1,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (11,'The sum of squares of two numbers is 80 and the square of difference between the two numbers is 36. Find the product of two numbers.','11','22','33','26','B',1,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (12,'he value of 1.07 × 65 + 1.07 × 26 + 1.07 × 9 is','10.73','10.7','10.70','107','D',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (13,'he average of first 50 natural numbers is________.','25.30','25.50','25.00','12.25','B',1,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (14,'The number of 3-digit numbers divisible by 6, are________.','149','166','150','151','B',1,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (15,'125 gallons of a mixture contains 20% water. What amount of additional water should be added such that water content be raised to 25%?','15/2','17/2','19/2','81/3','B',1,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (16,'Which of the following numbers gives 240 when added to its own square?','15','16','18','20','A',1,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (17,'Cornea is a transparent spherical structure which________. ','Reflects Light','Scatters Light','Refracts Light','None of the Above','C',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (18,'A virtual image is formed by a concave mirror when object is placed ','Between focus and centre of curvature','Beyond C','At infinity ','Between focus and pole','D',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (19,'No heat loss occurs during flow of charge in super  conductors because ','Speed of charge is slow in it','It is bad conductor of heat','It offers zero resistance','It generates very small voltage','C',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (20,'How do we know that fission isn\'t responsible for the sun’s energy ?','Fission doesn\'t produce enough energy per gram of fuel','If fission were going on in the sun, the sun would explode','If fission were going on in the sun, the sun\'s mass would increase','There isn\'t very much fissionable material in the sun','D',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (21,'During calcination of the ore','The lower oxides are converted into higher oxides','The metal gets oxidised to its highest oxide','Volatile impurities are expelled','Sulphur present in the ore is converted into SO2 ','C',2,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (22,'Which of the following statements is NOT true regarding cast iron?','It is hard and brittle.','It can be tempered.','It cannot be welded.','It contains 4 ­ 5% of carbon','B',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (23,'When the stopper of a bottle containing colourless  liquid was removed, the bottle gave a smell like that ','Hydrochloric acid solution','Sodium hydroxide solution ','Acetic acid solution','Saturated sodium bicarbonate solution','C',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (24,'Which one yields more energy? ','Direct burning of cowdung','Burning of biogas  derived from cowdung','Burning of manure derived from cowdung','Burning of semidecayed cowdung','B',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (25,'When  a  number  of  resistors  are  connected  end  to  end  such  that  the  tail  end  of  one  resistor  is  called________ circuit. ','Parallel','Series','Mixed','None Of The Above','B',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (26,'You  see a  rainbow formation. Then  the Sun is ____.','Behind you','In front of you','On your left hand side','On your right hand side','A',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (27,'In an electrical circuit  containing  a battery, the  positive ________.','always goes from positive  terminal to  the  negative ','may  go  from  positive  terminal  to  negative ','always goes from the  negative  terminal  to  positive ','does  not  move ','C',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (28,'How do  cyclones decrease  the  fertility  of  soil in  the ','By flooding  the land with saline  water.','By dissolving soil  and rocks.','By increasing  the  water table  of  the  place.','By decreasing the  water table  of  the  place.','A',2,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (29,'An  aeroplane  pilot  hears  a  slow  beat  from  the  two engines  of his  plane.  He  increases  the  speed  of the right  engine  and  now  hears  a  slower  beat.  What should  the  pilot  now  do, to  eliminate  the  beat? ','Increase  the  speed  of  the  left  engine','Decrease the  speed of  the  right  engine','Increase  the speed  of  both  engines','Increase  the speed  of  the  right engine','D',2,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (30,'The  nucleon  number  of atom  X  is  37.  It exists  as  a diatomic  molecule, X2 One  molecule  of  X2 contains 34  protons.  How  many  neutrons  are  present  in  the nucleus  of  atom  X?  ','17','21','20','25','A',2,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (31,'How many languages and dialects are spoken by people all over the world?','6000','9000','4000','1000','B',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (32,'Approximately, how many people speak Chinese language?','1 billion','1 million','1 lakh','1 thousand','A',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (33,'The language with the richest vocabulary is:','Hindi','French','English','German','C',3,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (34,'English Language have more than________words','450000','45000','4500','450','A',3,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (35,'The oldest Indian language is:','Telugu','Hindi','Tamil','Punjabi','C',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (36,'Marco Polo ','Discovered Greenland     ','Traveled China, India and other parts of Asia','Traveled round the cape of Good Hope','Discovered Canada','B',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (37,'Who were the first to circle the moon? ','Frank boreman, Bill Anders and Jim Lovell','Neil Armstrong and Edwin Aldrin','Charles Conrad and Alan Bean ','None of these ','A',3,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (38,'Where is the Vallabhbhai Patel stadium located?','Kolkata','Mumbai','Chennai','Delhi','B',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (39,'For which of the following disciplines in Nobel Prize awarded? ','Physics and chemistry','Physiology or Medicine ','Literature, Peace and Economics ','All the above ','D',3,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (40,'Dr. Linus Carl Pauling is the only person to have won two Nobel Prizes individually for','Chemistry in 1954, peace prize in 1962',' Peace prize in 1954, Chemistry in 1962  ','Physics in 154, Medicine in 1962 ','Medicine in 1954, Physics in 1962 ','A',3,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (41,'On which date is Nobel Prize awarded?','December 10','January 10','April 10','July 10','A',3,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (42,'DRDO was formed in___________.','1947','1950','1954','1958','D',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (43,'98th Indian Science Congress (ISC-2011) was held at___________.','SRM University','KIIT University','IIT,Chennai','IISc,Banglore','A',3,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (44,'Dr APJ Abdul Kalam, inaugurated state-of-the-art Navigation and Embedded Computers Complex on 9 Dec 2011 at ','RCI','FRL','ITR','DFRL','A',3,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (45,'Who was the Indian who won the gold medal for the first time in Olympic in shooting event. ','K.D. Jadhav ','Major Rajyawardhan Rathore ','Abhinav Bindra ','Samser Jang ','C',3,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (46,'Select the option which will replace the question mark in  the  given  number series 10,  100, 200,  310,?','400','410','420','430','B',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (47,'Mr.\'X\'shows three photographs to Mr.\'Y\'Pointing towards photograph 1,he says,\"The person in photograph 1 is my uncle,who says \'uncle\' to the person in photograph 2,and the person in photograph 3 is called \'uncle\' by the person in photograph 2.\"How is Mr.\'X\'related to the person in photograph 2? ','Grandson','Granddaughter','GreatGrandson','None of these','B',4,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (48,'Six people P,  Q, R,  S, T and U are sitting on the ground in  a  hexagonal  shape. All the sides of  the  hexagon,  so formed,  are  of  same length.  P  is  not adjacent to  Q  or R;  S  is  not adjacent  to  R  or T;  Q ancl  R  are  adjacent; U  is  in  the  middle  of  S  and  R. Who  is  at the  same d istance  from  S  as  T  is  from  S? ','Q','R','U','Can\'t be Determined','B',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (49,'If  the  alphabets  are  written  in  the  reverse  order after interchanging  alphabets from  \'D  to L\' with those  from \'R  to  Z\' respectively,  which  letter  would  be midway between  W  and  E  ','Z','D','N','None of these','C',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (50,'In  a code language, each of  the  vowels, i.e.,  A,E,I,O,and  U, is  substituted  by  the  letter preceding it,  while a  consonant  is  substituted  by the nearest vowel.  How can  the  word  EVIDENCE  be  written  in  that  code? ','DUHJEDOED','DUHEDUAD','DUJEDOAD','DUHEDOAD OR  DUHEDOED','D',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (51,'At  my  farmhouse  1  am  facing  East,  then  I  turn  left and  walk  l0  metres.  I  again  turn  right  and  walk  5 metres.  Again  I  go  5  metres  towards  the  South,  and from  there  walk 5  metres towards  the  West.  In  which direction  am  I  from  my farmhouse? ','East','West','North','South','C',4,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (52,'In a certain code language \'PROBLEM\' is written as \'MPERLOB\'. How will \'NUMBERS\' be written in that code? ','SNUREMB','SNRUBME','SNRUEMB','SNRUMEB','C',4,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (53,'The largest value is','4/5','80%','0.801','90.9)^2','D',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (54,'Rajat is holding a trivia contest. The 13 students who are participating randomly draw cards that are numbered with consecutive integers from 1 to  13. The student who draws number 1 will be the host. The  students who draw  the other odd numbers will be  on the Red Team.The  students who draw the even numbers will be on the  Blue Team. One student has already drawn a card and is on the Blue Team. If Partik is the next student to draw a card, what is  the probability that he will be  on  the Red','1/13','1/12','6/13','6/12','D',4,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (55,'If the second half of the following alphabets is written in the reverse order, which will be the 10 th letter to the left of 9 th letter counting from the right end? ','I','C','J','H','D',4,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (56,'Facing towards south, P started walking and turned left after walking 30 m, he walked 25 m and turned left and  walked 30 m. How  far is he from his starting position and in which direction ? ','At the starting point only','25 m, West','25 m, East','30 m, East ','C',4,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (57,'If \'100\' interchange \'1000\', \'–\' interchange \'/\', \'x\' interchange \'+\', then 100  – 10 x 1000 / 1000 x 100 x 10  =  ? ','1090','0','1110','20','C',4,1);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (58,'On another planet, the local terminology for earth, water, light, air and sky are ‘sky’, ‘light’, ‘air’, ‘water’ and ‘earth’ respectively. If someone is thirsty there, what would he drink? ','Sky','Water','Air','Light','D',4,2);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (59,'A, B, C, D, E, F and G are members of a family consisting of four adults and three children, two of whom, F and G are girls. A and D are brothers and A is a  doctor. E is an engineer married to one of the brothers and has two children. B is married to D and G is their child. Who is C? ','G’s brother','F’s father','E’s daughter','A’s son','D',4,3);
insert into `question` (`q_id`,`q_des`,`opt1`,`opt2`,`opt3`,`opt4`,`correct_ans`,`sub_id`,`difficulty`) values (60,'A bag contains 5 red balls and some blue balls. If  the probability of drawing a blue ball is double that of a red ball then the number of blue balls in the bag is ','10','5','8','7','A',4,3);

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_name` varchar(20) NOT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

insert into `subject` (`sub_id`,`sub_name`) values (1,'Mathematics');
insert into `subject` (`sub_id`,`sub_name`) values (2,'Science');
insert into `subject` (`sub_id`,`sub_name`) values (3,'GK');
insert into `subject` (`sub_id`,`sub_name`) values (4,'Mental Ability');

/*Table structure for table `temp` */

DROP TABLE IF EXISTS `temp`;

CREATE TABLE `temp` (
  `ques_no` int(11) NOT NULL,
  `q_id` int(11) DEFAULT NULL,
  `opt_selected` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ques_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `temp` */

insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (1,17,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (2,18,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (3,19,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (4,20,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (5,21,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (6,22,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (7,23,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (8,24,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (9,25,NULL);
insert into `temp` (`ques_no`,`q_id`,`opt_selected`) values (10,26,NULL);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
