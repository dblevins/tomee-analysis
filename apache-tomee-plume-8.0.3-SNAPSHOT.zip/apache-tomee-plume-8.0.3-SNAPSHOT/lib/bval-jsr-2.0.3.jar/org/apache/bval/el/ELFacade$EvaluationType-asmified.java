package asm.org.apache.bval.el;
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
public class ELFacade$EvaluationTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/bval/el/ELFacade$EvaluationType", "Ljava/lang/Enum<Lorg/apache/bval/el/ELFacade$EvaluationType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/bval/el/ELFacade$EvaluationType", "org/apache/bval/el/ELFacade", "EvaluationType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IMMEDIATE", "Lorg/apache/bval/el/ELFacade$EvaluationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFERRED", "Lorg/apache/bval/el/ELFacade$EvaluationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "regex", "Lorg/apache/bval/jsr/util/LookBehindRegexHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/bval/el/ELFacade$EvaluationType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/bval/el/ELFacade$EvaluationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "$VALUES", "[Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/bval/el/ELFacade$EvaluationType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/bval/el/ELFacade$EvaluationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/el/ELFacade$EvaluationType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/el/ELFacade$EvaluationType");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/LookBehindRegexHolder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("(?<!(?:^|[^\\\\])(?:\\\\\\\\){0,%%d}\\\\)%s\\{");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInvokeDynamicInsn("applyAsInt", "()Ljava/util/function/IntUnaryOperator;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(I)I"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "lambda$new$0", "(I)I", false), Type.getType("(I)I")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LookBehindRegexHolder", "<init>", "(Ljava/lang/String;Ljava/util/function/IntUnaryOperator;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/el/ELFacade$EvaluationType", "regex", "Lorg/apache/bval/jsr/util/LookBehindRegexHolder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$new$0", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/bval/el/ELFacade$EvaluationType;)Lorg/apache/bval/jsr/util/LookBehindRegexHolder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/el/ELFacade$EvaluationType", "regex", "Lorg/apache/bval/jsr/util/LookBehindRegexHolder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/el/ELFacade$EvaluationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMMEDIATE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("\\$");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/el/ELFacade$EvaluationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "IMMEDIATE", "Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/el/ELFacade$EvaluationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFERRED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("#");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/el/ELFacade$EvaluationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "DEFERRED", "Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/el/ELFacade$EvaluationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "IMMEDIATE", "Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "DEFERRED", "Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/el/ELFacade$EvaluationType", "$VALUES", "[Lorg/apache/bval/el/ELFacade$EvaluationType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
