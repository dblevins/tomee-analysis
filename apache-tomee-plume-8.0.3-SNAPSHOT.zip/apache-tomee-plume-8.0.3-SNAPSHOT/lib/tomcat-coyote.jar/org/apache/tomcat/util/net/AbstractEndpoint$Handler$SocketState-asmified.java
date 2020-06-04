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
public class AbstractEndpoint$Handler$SocketStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "Ljava/lang/Enum<Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler", "org/apache/tomcat/util/net/AbstractEndpoint", "Handler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "org/apache/tomcat/util/net/AbstractEndpoint$Handler", "SocketState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPEN", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LONG", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_END", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SENDFILE", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UPGRADING", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UPGRADED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPEN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "OPEN", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LONG");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "LONG", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_END");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "ASYNC_END", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SENDFILE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "SENDFILE", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UPGRADING");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "UPGRADING", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UPGRADED");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "UPGRADED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDED");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "SUSPENDED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "OPEN", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "CLOSED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "LONG", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "ASYNC_END", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "SENDFILE", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "UPGRADING", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "UPGRADED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "SUSPENDED", "Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState", "$VALUES", "[Lorg/apache/tomcat/util/net/AbstractEndpoint$Handler$SocketState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
