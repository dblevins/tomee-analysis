package asm.org.apache.catalina.authenticator;
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
public class DigestAuthenticator$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/authenticator/DigestAuthenticator$1", "Ljava/util/LinkedHashMap<Ljava/lang/String;Lorg/apache/catalina/authenticator/DigestAuthenticator$NonceInfo;>;", "java/util/LinkedHashMap", null);

classWriter.visitOuterClass("org/apache/catalina/authenticator/DigestAuthenticator", "startInternal", "()V");

classWriter.visitInnerClass("org/apache/catalina/authenticator/DigestAuthenticator$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/authenticator/DigestAuthenticator$NonceInfo", "org/apache/catalina/authenticator/DigestAuthenticator", "NonceInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG_SUPPRESS_TIME", "J", null, new Long(300000L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastLog", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/authenticator/DigestAuthenticator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/catalina/authenticator/DigestAuthenticator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "this$0", "Lorg/apache/catalina/authenticator/DigestAuthenticator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedHashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "lastLog", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "(Ljava/util/Map$Entry<Ljava/lang/String;Lorg/apache/catalina/authenticator/DigestAuthenticator$NonceInfo;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/authenticator/DigestAuthenticator$1", "size", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "this$0", "Lorg/apache/catalina/authenticator/DigestAuthenticator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/authenticator/DigestAuthenticator", "getNonceCacheSize", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "lastLog", "J");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/authenticator/DigestAuthenticator$NonceInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/authenticator/DigestAuthenticator$NonceInfo", "getTimestamp", "()J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "this$0", "Lorg/apache/catalina/authenticator/DigestAuthenticator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/authenticator/DigestAuthenticator", "getNonceValidity", "()J", false);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "this$0", "Lorg/apache/catalina/authenticator/DigestAuthenticator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/authenticator/DigestAuthenticator", "access$000", "(Lorg/apache/catalina/authenticator/DigestAuthenticator;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("digestAuthenticator.cacheRemove");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(300000L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/authenticator/DigestAuthenticator$1", "lastLog", "J");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
