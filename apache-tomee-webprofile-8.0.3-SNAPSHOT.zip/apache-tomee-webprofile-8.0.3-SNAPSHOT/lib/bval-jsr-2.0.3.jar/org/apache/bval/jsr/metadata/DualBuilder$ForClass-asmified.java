package asm.org.apache.bval.jsr.metadata;
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
public class DualBuilder$ForClassDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/DualBuilder$ForClass", "<T:Ljava/lang/Object;>Lorg/apache/bval/jsr/metadata/DualBuilder$ForElement<Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;Ljava/lang/Class<TT;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", "org/apache/bval/jsr/metadata/DualBuilder$ForElement", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$Delegator", "org/apache/bval/jsr/metadata/DualBuilder", "Delegator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForClass", "org/apache/bval/jsr/metadata/DualBuilder", "ForClass", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/DualBuilder$ForElement", "org/apache/bval/jsr/metadata/DualBuilder", "ForElement", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;)V", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator<*>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/DualBuilder$ForElement", "<init>", "(Lorg/apache/bval/jsr/metadata/DualBuilder$Delegator;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/DualBuilder$ForClass", "customDelegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/DualBuilder$ForClass", "customDelegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "getAnnotationBehavior", "()Lorg/apache/bval/jsr/metadata/AnnotationBehavior;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/metadata/AnnotationBehavior", "EXCLUDE", "Lorg/apache/bval/jsr/metadata/AnnotationBehavior;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/DualBuilder$ForClass", "primaryDelegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/List"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
