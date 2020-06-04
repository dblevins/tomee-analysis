package asm.org.apache.openejb.jee;
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
public class JavaeeSchemaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/jee/JavaeeSchema", "Ljava/lang/Enum<Lorg/apache/openejb/jee/JavaeeSchema;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION_6", "Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION_CLIENT_6", "Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEB_APP_3_0", "Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_JAR_3_1", "Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECTOR_1_6", "Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "schemaFileName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "$VALUES", "[Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/jee/JavaeeSchema;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/jee/JavaeeSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/JavaeeSchema;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/JavaeeSchema", "schemaFileName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchemaFileName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/JavaeeSchema", "schemaFileName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION_6");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("application_6.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/JavaeeSchema", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "APPLICATION_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION_CLIENT_6");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("application-client_6.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/JavaeeSchema", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "APPLICATION_CLIENT_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEB_APP_3_0");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("web-app_3_0.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/JavaeeSchema", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "WEB_APP_3_0", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_JAR_3_1");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("ejb-jar_3_1.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/JavaeeSchema", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "EJB_JAR_3_1", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECTOR_1_6");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("connector_1_6.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/JavaeeSchema", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "CONNECTOR_1_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/jee/JavaeeSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "APPLICATION_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "APPLICATION_CLIENT_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "WEB_APP_3_0", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "EJB_JAR_3_1", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/JavaeeSchema", "CONNECTOR_1_6", "Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/JavaeeSchema", "$VALUES", "[Lorg/apache/openejb/jee/JavaeeSchema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
