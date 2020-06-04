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
public class PrimitiveTypeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", null, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", new String[] { "javax/lang/model/type/PrimitiveType" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "BOOLEAN", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "BOOLEAN", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "BYTE", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "BYTE", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "CHAR", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "CHAR", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "DOUBLE", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "DOUBLE", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "FLOAT", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "FLOAT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "INT", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "INT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "LONG", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "LONG", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeBinding", "SHORT", "Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "SHORT", "Lorg/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/TypeMirrorImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;Lorg/eclipse/jdt/internal/compiler/lookup/Binding;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "accept", "(Ljavax/lang/model/type/TypeVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "<R:Ljava/lang/Object;P:Ljava/lang/Object;>(Ljavax/lang/model/type/TypeVisitor<TR;TP;>;TP;)TR;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/lang/model/type/TypeVisitor", "visitPrimitive", "(Ljavax/lang/model/type/PrimitiveType;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Ljavax/lang/model/type/TypeKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "_binding", "Lorg/eclipse/jdt/internal/compiler/lookup/Binding;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/jdt/internal/compiler/apt/model/PrimitiveTypeImpl", "getKind", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)Ljavax/lang/model/type/TypeKind;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getKind", "(Lorg/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding;)Ljavax/lang/model/type/TypeKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding", "id", "I");
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTableSwitchInsn(2, 10, label4, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "BOOLEAN", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "BYTE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "CHAR", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "DOUBLE", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "FLOAT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "INT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "LONG", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/type/TypeKind", "SHORT", "Ljavax/lang/model/type/TypeKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BaseTypeBinding of unexpected id ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/lookup/BaseTypeBinding", "id", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
