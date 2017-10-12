CREATE OR REPLACE FUNCTION add_pytanie (tresc TEXT) 
RETURNS boolean as $$
     DECLARE
      v_content TEXT;
      v_odp_1 text;
      v_odp_2 text;
      v_odp_3 text;
      v_odp_4 text;
      v_id bigint;
      
   BEGIN
	v_content := tresc;
	v_odp_1 = p_odp_1;
	v_odp_2 = p_odp_2;
	v_odp_3 = p_odp_3;
	v_odp_4 = p_odp_4;
   INSERT INTO question (id, content, odpowiedz_1, odpowiedz_2, odpowiedz_3, odpowiedz_4) VALUES (default, v_content, v_odp_1, v_odp_2, v_odp_3, v_odp_4)
     returning id into v_id;

	INSERT INTO question2category (id, id_question, id_category) VALUES (default, v_id, id_category);


     return v_id;
      
   END; 
   $$ LANGUAGE plpgsql;