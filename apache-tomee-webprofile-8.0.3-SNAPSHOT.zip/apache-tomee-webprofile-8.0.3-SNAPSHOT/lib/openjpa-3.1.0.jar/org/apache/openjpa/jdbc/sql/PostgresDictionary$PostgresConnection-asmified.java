package asm.org.apache.openjpa.jdbc.sql;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class PostgresDictionary$PostgresConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresConnection", null, "org/apache/openjpa/lib/jdbc/DelegatingConnection", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresConnection", "org/apache/openjpa/jdbc/sql/PostgresDictionary", "PostgresConnection", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresPreparedStatement", "org/apache/openjpa/jdbc/sql/PostgresDictionary", "PostgresPreparedStatement", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_dict", "Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/sql/Connection;Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "<init>", "(Ljava/sql/Connection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresConnection", "_dict", "Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;Z)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresConnection", "_dict", "Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresPreparedStatement", "<init>", "(Ljava/sql/PreparedStatement;Ljava/sql/Connection;Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresPreparedStatement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DelegatingConnection", "prepareStatement", "(Ljava/lang/String;IIZ)Ljava/sql/PreparedStatement;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresConnection", "_dict", "Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/PostgresDictionary$PostgresPreparedStatement", "<init>", "(Ljava/sql/PreparedStatement;Ljava/sql/Connection;Lorg/apache/openjpa/jdbc/sql/PostgresDictionary;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
