package asm.org.apache.openjpa.jdbc.meta;
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
public class ReverseMappingTool$AnnotatedCodeGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", null, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "AnnotatedCodeGenerator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "ReverseCodeGenerator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/enhance/ApplicationIdTool;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "<init>", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/enhance/ApplicationIdTool;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImportPackages", "()Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$ReverseCodeGenerator", "getImportPackages", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("javax.persistence");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getClassAnnotations", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "_mapping", "Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "getAnnotationsForMeta", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getFieldAnnotations", "(Lorg/apache/openjpa/meta/FieldMetaData;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "getAnnotationsForMeta", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "usePropertyBasedAccess", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("property");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ReverseMappingTool$AnnotatedCodeGenerator", "this$0", "Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/ReverseMappingTool", "access$600", "(Lorg/apache/openjpa/jdbc/meta/ReverseMappingTool;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
