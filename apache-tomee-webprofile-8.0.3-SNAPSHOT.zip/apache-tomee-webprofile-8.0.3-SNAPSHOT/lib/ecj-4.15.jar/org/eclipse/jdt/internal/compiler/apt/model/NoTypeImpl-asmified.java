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
public class NoTypeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", null, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", new String[] { "javax/lang/model/type/NoType", "javax/lang/model/type/NullType" });

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_kind", "Ljavax/lang/model/type/TypeKind;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TYPE_NONE", "Ljavax/lang/model/type/NoType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TYPE_VOID", "Ljavax/lang/model/type/NoType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TYPE_PACKAGE", "Ljavax/lang/model/type/NoType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_TYPE", "Ljavax/lang/model/type/NullType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TYPE_BINDING", "Lorg/eclipse/jdt/internal/compiler/lookup/Binding;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "NONE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "<init>", "(Ljavax/lang/model/type/TypeKind;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NO_TYPE_NONE", "Ljavax/lang/model/type/NoType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "VOID", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "VOID", "Lorg/eclipse/jdt/internal/compiler/lookup/VoidTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "<init>", "(Ljavax/lang/model/type/TypeKind;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NO_TYPE_VOID", "Ljavax/lang/model/type/NoType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "PACKAGE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "<init>", "(Ljavax/lang/model/type/TypeKind;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NO_TYPE_PACKAGE", "Ljavax/lang/model/type/NoType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "NULL", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "NULL", "Lorg/eclipse/jdt/internal/compiler/lookup/NullTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "<init>", "(Ljavax/lang/model/type/TypeKind;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NULL_TYPE", "Ljavax/lang/model/type/NullType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NO_TYPE_BINDING", "Lorg/eclipse/jdt/internal/compiler/lookup/Binding;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/lang/model/type/TypeKind;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "NO_TYPE_BINDING", "Lorg/eclipse/jdt/internal/compiler/lookup/Binding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "_kind", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/lang/model/type/TypeKind;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "_kind", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "accept", "(Ljavax/lang/model/type/TypeVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "<R:Ljava/lang/Object;P:Ljava/lang/Object;>(Ljavax/lang/model/type/TypeVisitor<TR;TP;>;TP;)TR;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "getKind", "()Ljavax/lang/model/type/TypeKind;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTableSwitchInsn(11, 11, label1, new Label[] { label0 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/lang/model/type/TypeVisitor", "visitNull", "(Ljavax/lang/model/type/NullType;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/lang/model/type/TypeVisitor", "visitNoType", "(Ljavax/lang/model/type/NoType;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Ljavax/lang/model/type/TypeKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "_kind", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "_kind", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label1, new int[] { 9, 10, 11, 17, 22 }, new Label[] { label0, label1, label2, label3, label4 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("null");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("void");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("package");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("module");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationMirrors", "()Ljava/util/List;", "()Ljava/util/List<+Ljavax/lang/model/element/AnnotationMirror;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/Factory", "EMPTY_ANNOTATION_MIRRORS", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)TA;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationsByType", "(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;", "<A::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TA;>;)[TA;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "newInstance", "(Ljava/lang/Class;I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "()[I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, "java/lang/NoSuchFieldError");
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTryCatchBlock(label15, label16, label17, "java/lang/NoSuchFieldError");
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
methodVisitor.visitTryCatchBlock(label18, label19, label20, "java/lang/NoSuchFieldError");
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
methodVisitor.visitTryCatchBlock(label21, label22, label23, "java/lang/NoSuchFieldError");
Label label24 = new Label();
Label label25 = new Label();
Label label26 = new Label();
methodVisitor.visitTryCatchBlock(label24, label25, label26, "java/lang/NoSuchFieldError");
Label label27 = new Label();
Label label28 = new Label();
Label label29 = new Label();
methodVisitor.visitTryCatchBlock(label27, label28, label29, "java/lang/NoSuchFieldError");
Label label30 = new Label();
Label label31 = new Label();
Label label32 = new Label();
methodVisitor.visitTryCatchBlock(label30, label31, label32, "java/lang/NoSuchFieldError");
Label label33 = new Label();
Label label34 = new Label();
Label label35 = new Label();
methodVisitor.visitTryCatchBlock(label33, label34, label35, "java/lang/NoSuchFieldError");
Label label36 = new Label();
Label label37 = new Label();
Label label38 = new Label();
methodVisitor.visitTryCatchBlock(label36, label37, label38, "java/lang/NoSuchFieldError");
Label label39 = new Label();
Label label40 = new Label();
Label label41 = new Label();
methodVisitor.visitTryCatchBlock(label39, label40, label41, "java/lang/NoSuchFieldError");
Label label42 = new Label();
Label label43 = new Label();
Label label44 = new Label();
methodVisitor.visitTryCatchBlock(label42, label43, label44, "java/lang/NoSuchFieldError");
Label label45 = new Label();
Label label46 = new Label();
Label label47 = new Label();
methodVisitor.visitTryCatchBlock(label45, label46, label47, "java/lang/NoSuchFieldError");
Label label48 = new Label();
Label label49 = new Label();
Label label50 = new Label();
methodVisitor.visitTryCatchBlock(label48, label49, label50, "java/lang/NoSuchFieldError");
Label label51 = new Label();
Label label52 = new Label();
Label label53 = new Label();
methodVisitor.visitTryCatchBlock(label51, label52, label53, "java/lang/NoSuchFieldError");
Label label54 = new Label();
Label label55 = new Label();
Label label56 = new Label();
methodVisitor.visitTryCatchBlock(label54, label55, label56, "java/lang/NoSuchFieldError");
Label label57 = new Label();
Label label58 = new Label();
Label label59 = new Label();
methodVisitor.visitTryCatchBlock(label57, label58, label59, "java/lang/NoSuchFieldError");
Label label60 = new Label();
Label label61 = new Label();
Label label62 = new Label();
methodVisitor.visitTryCatchBlock(label60, label61, label62, "java/lang/NoSuchFieldError");
Label label63 = new Label();
Label label64 = new Label();
Label label65 = new Label();
methodVisitor.visitTryCatchBlock(label63, label64, label65, "java/lang/NoSuchFieldError");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "[I");
methodVisitor.visitInsn(DUP);
Label label66 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label66);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label66);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[I"});
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/lang/model/type/TypeKind", "values", "()[Ljavax/lang/model/type/TypeKind;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "ARRAY", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"[I"}, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "BOOLEAN", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "BYTE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "CHAR", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "DECLARED", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label13);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "DOUBLE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label16);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "ERROR", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label19);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "EXECUTABLE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label22);
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "FLOAT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label25);
methodVisitor.visitJumpInsn(GOTO, label27);
methodVisitor.visitLabel(label26);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label27);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "INT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label28);
methodVisitor.visitJumpInsn(GOTO, label30);
methodVisitor.visitLabel(label29);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label30);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "INTERSECTION", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label31);
methodVisitor.visitJumpInsn(GOTO, label33);
methodVisitor.visitLabel(label32);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label33);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "LONG", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label34);
methodVisitor.visitJumpInsn(GOTO, label36);
methodVisitor.visitLabel(label35);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label36);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "MODULE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label37);
methodVisitor.visitJumpInsn(GOTO, label39);
methodVisitor.visitLabel(label38);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label39);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "NONE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label40);
methodVisitor.visitJumpInsn(GOTO, label42);
methodVisitor.visitLabel(label41);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label42);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "NULL", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label43);
methodVisitor.visitJumpInsn(GOTO, label45);
methodVisitor.visitLabel(label44);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label45);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "OTHER", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label46);
methodVisitor.visitJumpInsn(GOTO, label48);
methodVisitor.visitLabel(label47);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label48);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "PACKAGE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label49);
methodVisitor.visitJumpInsn(GOTO, label51);
methodVisitor.visitLabel(label50);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label51);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "SHORT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label52);
methodVisitor.visitJumpInsn(GOTO, label54);
methodVisitor.visitLabel(label53);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label54);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "TYPEVAR", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label55);
methodVisitor.visitJumpInsn(GOTO, label57);
methodVisitor.visitLabel(label56);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label57);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "UNION", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label58);
methodVisitor.visitJumpInsn(GOTO, label60);
methodVisitor.visitLabel(label59);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label60);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "VOID", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label61);
methodVisitor.visitJumpInsn(GOTO, label63);
methodVisitor.visitLabel(label62);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label63);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "WILDCARD", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/lang/model/type/TypeKind", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label64);
Label label67 = new Label();
methodVisitor.visitJumpInsn(GOTO, label67);
methodVisitor.visitLabel(label65);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label67);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/NoTypeImpl", "$SWITCH_TABLE$javax$lang$model$type$TypeKind", "[I");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
