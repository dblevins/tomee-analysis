package asm.org.apache.openjpa.persistence.meta;
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
public class AbstractManagedType$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/openjpa/persistence/meta/AbstractManagedType$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/openjpa/persistence/meta/AbstractManagedType", null, null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/AbstractManagedType$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("javax/persistence/metamodel/PluralAttribute$CollectionType", "javax/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$javax$persistence$metamodel$PluralAttribute$CollectionType", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "values", "()[Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AbstractManagedType$1", "$SwitchMap$javax$persistence$metamodel$PluralAttribute$CollectionType", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AbstractManagedType$1", "$SwitchMap$javax$persistence$metamodel$PluralAttribute$CollectionType", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "COLLECTION", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AbstractManagedType$1", "$SwitchMap$javax$persistence$metamodel$PluralAttribute$CollectionType", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "LIST", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AbstractManagedType$1", "$SwitchMap$javax$persistence$metamodel$PluralAttribute$CollectionType", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "SET", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/persistence/metamodel/PluralAttribute$CollectionType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
