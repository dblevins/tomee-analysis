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
public class EmptyBuilder$ForClassDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/EmptyBuilder$ForClass", "<T:Ljava/lang/Object;>Lorg/apache/bval/jsr/metadata/EmptyBuilder$ForElement<Ljava/lang/Class<TT;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", "org/apache/bval/jsr/metadata/EmptyBuilder$ForElement", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForClass", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForClass", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/EmptyBuilder$ForElement", "org/apache/bval/jsr/metadata/EmptyBuilder", "ForElement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/EmptyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/EmptyBuilder$ForClass", "this$0", "Lorg/apache/bval/jsr/metadata/EmptyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForElement", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;Lorg/apache/bval/jsr/metadata/EmptyBuilder$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/EmptyBuilder$ForClass", "<init>", "(Lorg/apache/bval/jsr/metadata/EmptyBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
