package asm.org.apache.cxf.jaxrs.ext.search.client;
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
public class FiqlSearchConditionBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", null, "org/apache/cxf/jaxrs/ext/search/client/SearchConditionBuilder", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "Builder", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "properties", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/client/SearchConditionBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "properties", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "properties", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "query", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "is", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "is", "(Ljava/lang/String;)Lorg/apache/cxf/jaxrs/ext/search/client/Property;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "and", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "and", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "and", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", "(Ljava/util/List<Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;>;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "and", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "or", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", "(Ljava/util/List<Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;>;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "or", "(Ljava/util/List;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "or", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder", "newBuilderInstance", "()Lorg/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/ext/search/client/FiqlSearchConditionBuilder$Builder", "or", "(Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;[Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;)Lorg/apache/cxf/jaxrs/ext/search/client/CompleteCondition;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
