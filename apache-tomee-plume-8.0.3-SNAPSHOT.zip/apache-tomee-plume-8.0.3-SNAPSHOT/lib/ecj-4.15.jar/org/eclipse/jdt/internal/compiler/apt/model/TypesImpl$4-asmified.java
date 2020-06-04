package asm.org.eclipse.jdt.internal.compiler.apt.model;
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
public class TypesImpl$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$4", null, "java/lang/Object", new String[] { "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$MemberInTypeFinder" });

classWriter.visitOuterClass("org/eclipse/jdt/internal/compiler/apt/model/TypesImpl", "asMemberOf", "(Ljavax/lang/model/type/DeclaredType;Ljavax/lang/model/element/Element;)Ljavax/lang/model/type/TypeMirror;");

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$4", null, null, 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$MemberInTypeFinder", "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl", "MemberInTypeFinder", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/TypesImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/model/TypesImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$4", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/TypesImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "(Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)Ljavax/lang/model/type/TypeMirror;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "memberTypes", "()[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$4", "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "org/eclipse/jdt/internal/compiler/lookup/Binding", "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/jdt/internal/compiler/lookup/ReferenceBinding;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "compoundName", "[[C");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/ReferenceBinding", "compoundName", "[[C");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/core/compiler/CharOperation", "equals", "([[C[[C)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl$4", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/TypesImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/model/TypesImpl", "access$1", "(Lorg/eclipse/jdt/internal/compiler/apt/model/TypesImpl;)Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "getFactory", "()Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/model/Factory", "newTypeMirror", "(Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)Ljavax/lang/model/type/TypeMirror;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
