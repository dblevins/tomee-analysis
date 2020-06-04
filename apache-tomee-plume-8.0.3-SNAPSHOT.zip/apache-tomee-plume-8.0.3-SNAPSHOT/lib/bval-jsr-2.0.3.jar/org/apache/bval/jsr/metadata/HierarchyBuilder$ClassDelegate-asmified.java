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
public class HierarchyBuilder$ClassDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "<H:Ljava/lang/Object;T:TH;>Lorg/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate<Ljava/lang/Class<TH;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TH;>;>;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TT;>;", "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", new String[] { "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass" });

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForClass", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ClassDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ElementDelegate", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass;Lorg/apache/bval/jsr/metadata/Meta;)V", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForClass<TH;>;Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TH;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForClass", "getGroupSequence", "(Lorg/apache/bval/jsr/metadata/Meta;)Ljava/util/List;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", "(Lorg/apache/bval/jsr/metadata/Meta<Ljava/lang/Class<TT;>;>;)[Ljava/lang/annotation/Annotation;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$ClassDelegate", "getDeclaredConstraints", "()[Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
