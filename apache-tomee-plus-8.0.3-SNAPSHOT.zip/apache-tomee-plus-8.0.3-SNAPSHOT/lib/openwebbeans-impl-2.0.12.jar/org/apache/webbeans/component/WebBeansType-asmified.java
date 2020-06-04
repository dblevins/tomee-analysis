package asm.org.apache.webbeans.component;
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
public class WebBeansTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/webbeans/component/WebBeansType", "Ljava/lang/Enum<Lorg/apache/webbeans/component/WebBeansType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANAGED", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONFIGURED", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRODUCERMETHOD", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRODUCERFIELD", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESOURCEBEAN", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEW", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTERPRISE", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JMS", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEPENDENT", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERCEPTOR", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DECORATOR", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OBSERVABLE", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANAGER", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONVERSATION", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INSTANCE", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INJECTIONPOINT", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "THIRDPARTY", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXTENSION", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USERTRANSACTION", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRINCIPAL", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATIONFACT", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATION", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METADATA", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVLET_CONTEXT", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVLET_REQUEST", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERCEPTIONFACTORY", "Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/webbeans/component/WebBeansType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/webbeans/component/WebBeansType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "$VALUES", "[Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/webbeans/component/WebBeansType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/webbeans/component/WebBeansType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/component/WebBeansType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/component/WebBeansType");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANAGED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "MANAGED", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONFIGURED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "CONFIGURED", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRODUCERMETHOD");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "PRODUCERMETHOD", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRODUCERFIELD");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "PRODUCERFIELD", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESOURCEBEAN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "RESOURCEBEAN", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEW");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "NEW", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTERPRISE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "ENTERPRISE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JMS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "JMS", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEPENDENT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "DEPENDENT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERCEPTOR");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "INTERCEPTOR", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DECORATOR");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "DECORATOR", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OBSERVABLE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "OBSERVABLE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANAGER");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "MANAGER", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONVERSATION");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "CONVERSATION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INSTANCE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "INSTANCE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INJECTIONPOINT");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "INJECTIONPOINT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("THIRDPARTY");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "THIRDPARTY", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXTENSION");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "EXTENSION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USERTRANSACTION");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "USERTRANSACTION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRINCIPAL");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "PRINCIPAL", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATIONFACT");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "VALIDATIONFACT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATION");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "VALIDATION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METADATA");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "METADATA", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVLET_CONTEXT");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "SERVLET_CONTEXT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVLET_REQUEST");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "SERVLET_REQUEST", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERCEPTIONFACTORY");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/component/WebBeansType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "INTERCEPTIONFACTORY", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/webbeans/component/WebBeansType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "MANAGED", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "CONFIGURED", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "PRODUCERMETHOD", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "PRODUCERFIELD", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "RESOURCEBEAN", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "NEW", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "ENTERPRISE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "JMS", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "DEPENDENT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "INTERCEPTOR", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "DECORATOR", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "OBSERVABLE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "MANAGER", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "CONVERSATION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "INSTANCE", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "INJECTIONPOINT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "THIRDPARTY", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "EXTENSION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "USERTRANSACTION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "PRINCIPAL", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "VALIDATIONFACT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "VALIDATION", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "METADATA", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "SERVLET_CONTEXT", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "SERVLET_REQUEST", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/component/WebBeansType", "INTERCEPTIONFACTORY", "Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/component/WebBeansType", "$VALUES", "[Lorg/apache/webbeans/component/WebBeansType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
