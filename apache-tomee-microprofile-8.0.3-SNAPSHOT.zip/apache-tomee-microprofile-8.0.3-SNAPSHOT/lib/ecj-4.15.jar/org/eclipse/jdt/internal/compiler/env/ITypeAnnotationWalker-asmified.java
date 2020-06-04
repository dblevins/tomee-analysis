package asm.org.eclipse.jdt.internal.compiler.env;
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
public class ITypeAnnotationWalkerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_ANNOTATIONS", "[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_ANNOTATION_WALKER", "Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/env/IBinaryAnnotation");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker", "NO_ANNOTATIONS", "[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker", "EMPTY_ANNOTATION_WALKER", "Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toField", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toMethodReturn", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toReceiver", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toTypeParameter", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toTypeParameterBounds", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toTypeBound", "(S)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toSupertype", "(S[C)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toMethodParameter", "(S)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toThrows", "(I)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toTypeArgument", "(I)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toWildcardBound", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toNextArrayDimension", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toNextNestedType", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnnotationsAtCursor", "(IZ)[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
