INSERT INTO recruteur (id_recruteur,prenom,nom,email,photo,libelle_entreprise,mot_de_passe) VALUES
(1,'Homer', 'Simpson', 'homer@gmail.com', null,'CEGID','azer'),
(2,'Eric', 'Cartman', 'eric@gmail.com', null,'DALKIA','123456'),
(3,'Jake', 'Peralta', 'jake@gmail.com', null, 'INESCRM','azertyuiop');



INSERT INTO offre (id_offre,titre,reference,nom_entreprise,date_creation,date_fin_validite,description,ville,niveau_diplome_vise,id_recruteur,logo,profil_souhaite,profil_minimum,connaissance_necessaires,outils_necessaires,salaire_indicatif)
VALUES
    (1,
    ' Gestionnaire Souscriptions- Marseille H/F',
    '611912/203117',
    'Engie',
    current_timestamp(),
    '2022-05-22',
    'Vous souhaitez acquérir une solide expérience au sein d''une compagnie d''assurance ? Vous souhaitez réaliser un BTS en alternance ? Vous entrez facilement en contact avec les autres ? Vous êtes animé.e par l''envie de comprendre et de découvrir de nouvelles choses ?
    - Vous intégrez un BTS dans le domaine de l''assurance. - Vous possédez le sens de l''écoute, du service, et de la pédagogie. - Vous êtes sensible au bien commun, à l''écoute et au travail d''équipe. - Vous savez vous adapter et progresser rapidement.',
    'Lyon',
    'Bac +5',
    2,
    'https://www.referenseo.com/',
    'Bac +3',
    'Bac +2 avec au moins 5 ans d''experience',
    'Language JAVA et Javascript',
    'Pas d''outils spécifiques demandés',
    28000
    ),
    (2,
    'Chargé de Qualité Sécurité Evènementiel - Alternance H/F',
    '611954/200917',
    'Stem Groupe',
    current_timestamp(),
    '2022-05-28',
    'STEM PROPRETE IDF, filiale du Groupe STEM, est spécialisée dans l''hygiène et la propreté des locaux professionnels et maintient vos espaces professionnels propres et agréables pour l''ensemble de vos collaborateurs et clients.
    - Vous intégrez un BTS dans le domaine de l''assurance.',
    'Paris',
    'Bac +3',
    1,
    'https://www.referenseo.com/',
    'Bac +3',
    'Bac +2 avec au moins 5 ans d''experience',
    'Language C++ , C#',
    'Pas d''outils spécifiques demandés',
    35000
    ),
    (3,
    'Caviste H/F',
    '078954/438717',
    'Boisset - La Famille des Grands Vins',
    current_timestamp(),
    '2022-08-09',
    'Boisset, La Famille des Grands Vins, est une entreprise familiale qui a su devenir un grand nom international en s''appuyant sur des valeurs fortes, tirées de ses origines bourguignonnes. Avec plus de 350 salariés et une présence dans 80 pays, le groupe se classe parmi les 5 premières entreprises françaises évoluant dans le domaine des vins fins et des vins effervescents.
    - Vous intégrez un BTS dans le domaine de l''oenologie.',
    'Bordeaux',
    'Bac +3',
    2,
    'https://www.referenseo.com/',
    'Bac +3',
    'Bac +2 avec au moins 5 ans d''experience dans un domaine viticole',
    'Termes viticoles',
    'Moyen de locomotion',
    25000
    );

