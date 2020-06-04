package asm.org.apache.catalina.filters;
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
public class RestCsrfPreventionFilter$StateChangingRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", null, "java/lang/Object", new String[] { "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy" });

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "org/apache/catalina/filters/RestCsrfPreventionFilter", "StateChangingRequest", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "org/apache/catalina/filters/RestCsrfPreventionFilter", "RestCsrfPreventionStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceSupplier", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceConsumer", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "extractNonceFromRequest", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "nonceFromSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getSession", "(Z)Ljavax/servlet/http/HttpSession;", true);
methodVisitor.visitLdcInsn("org.apache.catalina.filters.CSRF_REST_NONCE");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "getNonce", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "isValidStateChangingRequest", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "nonceToResponse", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("X-CSRF-Token");
methodVisitor.visitLdcInsn("Required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "setNonce", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter", "getDenyStatus", "()I", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/FilterBase", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("restCsrfPreventionFilter.invalidNonce");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletResponse", "sendError", "(ILjava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isValidStateChangingRequest", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "nonNull", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "nonNull", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extractNonceFromRequest", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "nonceFromRequestHeader", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("X-CSRF-Token");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "getNonce", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "isNull", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter", "getPathsAcceptingParams", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter", "getPathsAcceptingParams", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter", "getRequestedPath", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "extractNonceFromRequestParams", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extractNonceFromRequestParams", "(Ljavax/servlet/http/HttpServletRequest;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "nonceFromRequestParams", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("X-CSRF-Token");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "getNonce", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "nonNull", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "javax/servlet/http/HttpServletRequest", "[Ljava/lang/String;", "java/lang/String", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;Lorg/apache/catalina/filters/RestCsrfPreventionFilter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$StateChangingRequest", "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
