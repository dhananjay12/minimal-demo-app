-- Will get loaded by container and create the databases
CREATE DATABASE IF NOT EXISTS test;

use test;

CREATE TABLE fortune (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    text VARCHAR(500) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO fortune (text) VALUES ('A beautiful, smart, and loving person will be coming into your life.');
INSERT INTO fortune (text) VALUES ('A dubious friend may be an enemy in camouflage.');
INSERT INTO fortune (text) VALUES ('A faithful friend is a strong defense.');
INSERT INTO fortune (text) VALUES ('A feather in the hand is better than a bird in the air.');
INSERT INTO fortune (text) VALUES ('A fresh start will put you on your way.');
INSERT INTO fortune (text) VALUES ('A friend asks only for your time not your money.');
INSERT INTO fortune (text) VALUES ('A friend is a present you give yourself.');
INSERT INTO fortune (text) VALUES ('A gambler not only will lose what he has, but also will lose what he doesn’t have.');
INSERT INTO fortune (text) VALUES ('A golden egg of opportunity falls into your lap this month.');
INSERT INTO fortune (text) VALUES ('A good friendship is often more important than a passionate romance.');
INSERT INTO fortune (text) VALUES ('A good time to finish up old tasks.');
INSERT INTO fortune (text) VALUES ('A hunch is creativity trying to tell you something.');
INSERT INTO fortune (text) VALUES ('A lifetime friend shall soon be made.');
INSERT INTO fortune (text) VALUES ('A lifetime of happiness lies ahead of you.');
INSERT INTO fortune (text) VALUES ('A light heart carries you through all the hard times.');
INSERT INTO fortune (text) VALUES ('A new perspective will come with the new year.');
INSERT INTO fortune (text) VALUES ('A person is never to (sic) old to learn.');
INSERT INTO fortune (text) VALUES ('A person of words and not deeds is like a garden full of weeds.');
INSERT INTO fortune (text) VALUES ('A pleasant surprise is waiting for you.');
INSERT INTO fortune (text) VALUES ('A short pencil is usually better than a long memory any day.');
INSERT INTO fortune (text) VALUES ('A small donation is call for. It’s the right thing to do.');
INSERT INTO fortune (text) VALUES ('A smile is your personal welcome mat.');
INSERT INTO fortune (text) VALUES ('A smooth long journey! Great expectations.');
INSERT INTO fortune (text) VALUES ('A soft voice may be awfully persuasive.');
INSERT INTO fortune (text) VALUES ('A truly rich life contains love and art in abundance.');
INSERT INTO fortune (text) VALUES ('Accept something that you cannot change, and you will feel better.');