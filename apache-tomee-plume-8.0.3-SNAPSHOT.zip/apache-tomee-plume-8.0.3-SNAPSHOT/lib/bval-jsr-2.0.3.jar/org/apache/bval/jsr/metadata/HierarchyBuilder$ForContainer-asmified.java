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
public class HierarchyBuilder$ForContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/HierarchyBuilder$ForContainer", "<E::Ljava/lang/reflect/AnnotatedElement;>Lorg/apache/bval/jsr/metadata/CompositeBuilder$ForContainer<Lorg/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate<TE;>;TE;>;", "org/apache/bval/jsr/metadata/CompositeBuilder$ForContainer", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ForContainer", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ForContainer", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ContainerDelegate", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/CompositeBuilder$ForContainer", "org/apache/bval/jsr/metadata/CompositeBuilder", "ForContainer", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Ljava/util/List;Ljavax/validation/ElementKind;)V", "(Ljava/util/List<Lorg/apache/bval/jsr/metadata/HierarchyBuilder$ContainerDelegate<TE;>;>;Ljavax/validation/ElementKind;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ForContainer", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/CompositeBuilder$ForContainer", "<init>", "(Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("elementKind");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/ElementKind");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/Liskov", "validateContainerHierarchy", "(Ljava/util/Collection;Ljavax/validation/ElementKind;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
