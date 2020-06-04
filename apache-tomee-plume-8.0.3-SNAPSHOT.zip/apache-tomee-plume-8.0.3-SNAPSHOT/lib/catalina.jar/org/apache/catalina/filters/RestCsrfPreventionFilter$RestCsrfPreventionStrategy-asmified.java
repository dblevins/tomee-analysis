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
public class RestCsrfPreventionFilter$RestCsrfPreventionStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceSupplier", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer", "org/apache/catalina/filters/RestCsrfPreventionFilter", "NonceConsumer", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "org/apache/catalina/filters/RestCsrfPreventionFilter", "RestCsrfPreventionStrategy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "nonceFromRequestHeader", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier<Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "nonceFromRequestParams", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier<Ljavax/servlet/http/HttpServletRequest;[Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "nonceFromSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier<Ljavax/servlet/http/HttpSession;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "nonceToResponse", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer<Ljavax/servlet/http/HttpServletResponse;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "nonceToSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer<Ljavax/servlet/http/HttpSession;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "apply", "(Ljavax/servlet/http/HttpServletRequest;Ljavax/servlet/http/HttpServletResponse;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$4", "(Ljavax/servlet/http/HttpSession;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$3", "(Ljavax/servlet/http/HttpServletResponse;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletResponse", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$2", "(Ljavax/servlet/http/HttpSession;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "isNull", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpSession", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$1", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getParameterValues", "(Ljava/lang/String;)[Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$0", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInvokeDynamicInsn("getNonce", "()Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "lambda$static$0", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)Ljava/lang/String;", true), Type.getType("(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)Ljava/lang/String;")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "nonceFromRequestHeader", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitInvokeDynamicInsn("getNonce", "()Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "lambda$static$1", "(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)[Ljava/lang/String;", true), Type.getType("(Ljavax/servlet/http/HttpServletRequest;Ljava/lang/String;)[Ljava/lang/String;")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "nonceFromRequestParams", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitInvokeDynamicInsn("getNonce", "()Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "lambda$static$2", "(Ljavax/servlet/http/HttpSession;Ljava/lang/String;)Ljava/lang/String;", true), Type.getType("(Ljavax/servlet/http/HttpSession;Ljava/lang/String;)Ljava/lang/String;")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "nonceFromSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceSupplier;");
methodVisitor.visitInvokeDynamicInsn("setNonce", "()Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "lambda$static$3", "(Ljavax/servlet/http/HttpServletResponse;Ljava/lang/String;Ljava/lang/String;)V", true), Type.getType("(Ljavax/servlet/http/HttpServletResponse;Ljava/lang/String;Ljava/lang/String;)V")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "nonceToResponse", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;");
methodVisitor.visitInvokeDynamicInsn("setNonce", "()Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "lambda$static$4", "(Ljavax/servlet/http/HttpSession;Ljava/lang/String;Ljava/lang/String;)V", true), Type.getType("(Ljavax/servlet/http/HttpSession;Ljava/lang/String;Ljava/lang/String;)V")});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$RestCsrfPreventionStrategy", "nonceToSession", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$NonceConsumer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
