(ns learn-a-language.important-phrases
  (:gen-class))

;; It's time for some Russian love!
(def russian
  [["I love you (care for you) (-said to female)" "Ty mne ne bezrazlichna"]
   ["I love you (care for you) (-said to male)" "Ty mne ne bezrazlichen"]
   ["I love you (more serious)" "Ya tebya lyublyu"]
   ["Do you love me? (care for me?) (female)" "Ya tebe ne bezrazlichna?"]
   ["Do you love me? (care for me?) (male)" "Ya tebe ne bezrazlichen?"]
   ["Do you love me? (more serious)" "Ty menya lyubish?"]
   ["I (female) am in love" "Ya vlyublena"]
   ["I (male) am in love" "Ya vlyublion"]
   ["You are beautiful" "Ty krasivaya"]
   ["You are handsome" "Ty krasivyy"]
   ["I am passionate about you (female)" "Ya uvlechena toboy"]
   ["I am passionate about you (male)" "Ya uvlechion toboy"]
   ["You make me happy" "Ty dostavlyaesh mne radost’"]
   ["Will you marry me? (female)" "Ty zhenishsya na mne?"]
   ["Will you marry me? (male)" "Ty vyydesh za menya zamuzh?"]
   ["She’s my fiancé" "Ona moya nevesta"]
   ["He’s my fiancé" "On moy zhenikh"]
   ["You are the love of my life." "Ty lyubov’ vsey moey zhizni"]
   ["I adore you" "Ya tebya obozhayu"]
   ["I miss you" "Ya skuchayu po tebe"]
   ["Would you like to be my boyfriend?" "Budesh moim parnem"]
   ["Would you like to be my girlfriend?" "Budesh moey devushkoi"]
   ["I want to be with you forever." "Ya khochu byt’ s toboy vsegda"]
   ["I need you (to female)" "Ty nuzhna mne"]
   ["I need you (to male)" "Ty nuzhen mne"]
   ["I always think about you" "Ya vsio vremya dumayu o tebe"]
   ["I like you" "Ty mne nravishsya"]
   ["Kiss me" "Potzeluy menya"]
   ["Hug me" "Obnimi menya"]])

(defn -main
  [which]
  (let [phrases (get russian (Integer. which))]
    (println "English: " (first phrases))
    (println "Russian: " (second phrases))))