create or replace procedure actualizar_principalingrediente(

    p_id IN NUMBER,
    p_principalingrediente IN NUMBER

) AS
BEGIN
    UPDATE comida SET principalingrediente = p_principalingrediente WHERE id = p_id;
    COMMIT;
END actualizar_principalingrediente;    