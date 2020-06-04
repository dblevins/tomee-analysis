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
public class HierarchyBuilder$ForCrossParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/HierarchyBuilder$ForCrossParameter", "<E:Ljava/lang/reflect/Executable;>Lorg/apache/bval/jsr/metadata/CompositeBuilder$ForElement<Lorg/apache/bval/jsr/metadata/HierarchyBuilder$CrossParameterDelegate<TE;>;TE;>;", "org/apache/bval/jsr/metadata/CompositeBuilder$ForElement", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ForCrossParameter", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ForCrossParameter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$CrossParameterDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "CrossParameterDelegate", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/CompositeBuilder$ForElement", "org/apache/bval/jsr/metadata/CompositeBuilder", "ForElement", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/HierarchyBuilder;Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/bval/jsr/metadata/HierarchyBuilder$CrossParameterDelegate<TE;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ForCrossParameter", "this$0", "Lorg/apache/bval/jsr/metadata/HierarchyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/CompositeBuilder$ForElement", "<init>", "(Lorg/apache/bval/jsr/metadata/CompositeBuilder;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/metadata/Liskov", "validateCrossParameterHierarchy", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
