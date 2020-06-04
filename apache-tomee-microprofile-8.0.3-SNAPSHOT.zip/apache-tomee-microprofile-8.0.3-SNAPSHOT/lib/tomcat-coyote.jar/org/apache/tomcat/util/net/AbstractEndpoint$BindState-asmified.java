package asm.org.apache.tomcat.util.net;
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
public class AbstractEndpoint$BindStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$BindState", "org/apache/tomcat/util/net/AbstractEndpoint", "BindState", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNBOUND", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOUND_ON_INIT", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOUND_ON_START", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SOCKET_CLOSED_ON_STOP", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNBOUND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "UNBOUND", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOUND_ON_INIT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "BOUND_ON_INIT", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOUND_ON_START");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "BOUND_ON_START", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SOCKET_CLOSED_ON_STOP");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "SOCKET_CLOSED_ON_STOP", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/AbstractEndpoint$BindState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "UNBOUND", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "BOUND_ON_INIT", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "BOUND_ON_START", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "SOCKET_CLOSED_ON_STOP", "Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$BindState", "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$BindState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
