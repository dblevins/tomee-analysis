package asm.org.eclipse.jdt.internal.compiler.lookup;
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
public class ParameterNonNullDefaultProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$1", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$MixedProvider", "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider", "MixedProvider", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FALSE_PROVIDER", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRUE_PROVIDER", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider", "FALSE_PROVIDER", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider", "TRUE_PROVIDER", "Lorg/eclipse/jdt/internal/compiler/lookup/ParameterNonNullDefaultProvider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasAnyNonNullDefault", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasNonNullDefaultForParam", "(I)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
