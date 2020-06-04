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
public class CacheDictionaryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/sql/CacheDictionary", null, "org/apache/openjpa/jdbc/sql/DBDictionary", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/DBDictionary", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Intersystems Cache");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "platform", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "supportsDeferredConstraints", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "supportsSelectForUpdate", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SET OPTION DUMMY=DUMMY");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "validationSQL", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "bigintTypeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NUMERIC");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "numericTypeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LONGVARCHAR");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "clobTypeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LONGVARBINARY");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "blobTypeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DEFAULT OBJECTSCRIPT '$INCREMENT(^LogNumber)'");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "autoAssignClause", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT MAX({0}) FROM {1}");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/CacheDictionary", "lastGeneratedKeyQuery", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
