package asm.org.apache.activemq.broker;
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
public class PublishedAddressPolicy$PublishedHostStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "Ljava/lang/Enum<Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "org/apache/activemq/broker/PublishedAddressPolicy", "PublishedHostStrategy", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IPADDRESS", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOSTNAME", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FQDN", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "$VALUES", "[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getValue", "(Ljava/lang/String;)Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "ENGLISH", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toUpperCase", "(Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "valueOf", "(Ljava/lang/String;)Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "DEFAULT", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IPADDRESS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "IPADDRESS", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOSTNAME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "HOSTNAME", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FQDN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "FQDN", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "DEFAULT", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "IPADDRESS", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "HOSTNAME", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "FQDN", "Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy", "$VALUES", "[Lorg/apache/activemq/broker/PublishedAddressPolicy$PublishedHostStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
