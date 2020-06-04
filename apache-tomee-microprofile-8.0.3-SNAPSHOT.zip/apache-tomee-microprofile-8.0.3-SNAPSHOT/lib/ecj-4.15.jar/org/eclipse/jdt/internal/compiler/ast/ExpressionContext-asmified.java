package asm.org.eclipse.jdt.internal.compiler.ast;
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
public class ExpressionContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ENUM | ACC_ABSTRACT, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "Ljava/lang/Enum<Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/ExpressionContext$1", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/ExpressionContext$2", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/ExpressionContext$3", null, null, ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/ast/ExpressionContext$4", null, null, ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASSIGNMENT_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVOCATION_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CASTING_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VANILLA_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASSIGNMENT_CONTEXT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "ASSIGNMENT_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVOCATION_CONTEXT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "INVOCATION_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CASTING_CONTEXT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "CASTING_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VANILLA_CONTEXT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext$4", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "VANILLA_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "ASSIGNMENT_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "INVOCATION_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "CASTING_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "VANILLA_CONTEXT", "Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "definesTargetType", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "ENUM$VALUES", "[Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/eclipse/jdt/internal/compiler/ast/ExpressionContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/ast/ExpressionContext", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
