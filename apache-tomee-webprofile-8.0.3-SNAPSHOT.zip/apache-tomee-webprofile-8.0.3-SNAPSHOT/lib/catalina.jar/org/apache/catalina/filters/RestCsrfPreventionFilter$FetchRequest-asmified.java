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
public class RestCsrfPreventionFilter$FetchRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", null, "java/lang/Object", new String[] { "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy" });

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "org/apache/catalina/filters/RestCsrfPreventionFilter", "FetchRequest", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "org/apache/catalina/filters/RestCsrfPreventionFilter", "RestCsrfPreventionStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceSupplier", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceConsumer", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "fetchRequest", "Ljava/util/function/Predicate;", "Ljava/util/function/Predicate<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "lambda$new$0", "(Ljava/lang/String;)Z", false), Type.getType("(Ljava/lang/String;)Z")});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "fetchRequest", "Ljava/util/function/Predicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "fetchRequest", "Ljava/util/function/Predicate;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "nonceFromRequestHeader", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("X-CSRF-Token");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "getNonce", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "test", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "nonceFromSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getSession", "(Z)Ljavax/servlet/http/HttpSession;", true);
methodVisitor.visitLdcInsn("org.apache.catalina.filters.CSRF_REST_NONCE");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "getNonce", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "this$0", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter", "generateNonce", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "nonceToSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getSession", "(Z)Ljavax/servlet/http/HttpSession;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "requireNonNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitLdcInsn("org.apache.catalina.filters.CSRF_REST_NONCE");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "setNonce", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "nonceToResponse", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("X-CSRF-Token");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "setNonce", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("Fetch");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;Lorg/apache/catalina/filters/RestCsrfPreventionFilter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$FetchRequest", "<init>", "(Lorg/apache/catalina/filters/RestCsrfPreventionFilter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
