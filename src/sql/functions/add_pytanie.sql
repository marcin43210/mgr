CREATE OR REPLACE FUNCTION add_pytanie (tresc TEXT) 
RETURNS boolean as $$
   DECLARE
      v_content TEXT;
      
   BEGIN
	v_content := tresc;
   INSERT INTO question (id, content) VALUES (default, v_question);
     RETURN TRUE;
      
   END; 
   $$ LANGUAGE plpgsql;