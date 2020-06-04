package asm.org.eclipse.jdt.internal.compiler.classfmt;
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
public class ExternalAnnotationProvider$DispatchingAnnotationWalkerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", null, "java/lang/Object", new String[] { "org/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker" });

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider", "DispatchingAnnotationWalker", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$SuperTypesAnnotationWalker", "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider", "SuperTypesAnnotationWalker", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker", "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider", "TypeParametersAnnotationWalker", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "environment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "environment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toTypeParameter", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider", "typeParametersAnnotationSource", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "environment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker", "<init>", "(Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;[CII[ILorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker", "toTypeParameter", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toTypeParameterBounds", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "typeParametersWalker", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$TypeParametersAnnotationWalker", "toTypeParameterBounds", "(ZI)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toSupertype", "(S[C)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider", "supertypeAnnotationSources", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "([C)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$SuperTypesAnnotationWalker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "this$0", "Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "environment", "Lorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$SuperTypesAnnotationWalker", "<init>", "(Lorg/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider;[CLorg/eclipse/jdt/internal/compiler/lookup/LookupEnvironment;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toField", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toThrows", "(I)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toTypeArgument", "(I)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toMethodParameter", "(S)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toTypeBound", "(S)Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toMethodReturn", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toReceiver", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toWildcardBound", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toNextArrayDimension", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toNextNestedType", "()Lorg/eclipse/jdt/internal/compiler/env/ITypeAnnotationWalker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationsAtCursor", "(IZ)[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/classfmt/ExternalAnnotationProvider$DispatchingAnnotationWalker", "NO_ANNOTATIONS", "[Lorg/eclipse/jdt/internal/compiler/env/IBinaryAnnotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
