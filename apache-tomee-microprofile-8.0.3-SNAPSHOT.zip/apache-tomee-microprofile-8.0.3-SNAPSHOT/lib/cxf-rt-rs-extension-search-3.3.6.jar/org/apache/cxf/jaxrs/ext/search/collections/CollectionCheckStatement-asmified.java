package asm.org.apache.cxf.jaxrs.ext.search.collections;
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
public class CollectionCheckStatementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/collections/CollectionCheckStatement", null, "org/apache/cxf/jaxrs/ext/search/PrimitiveStatement", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "checkInfo", "Lorg/apache/cxf/jaxrs/ext/search/collections/CollectionCheckInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Lorg/apache/cxf/jaxrs/ext/search/ConditionType;Lorg/apache/cxf/jaxrs/ext/search/collections/CollectionCheckInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/ext/search/PrimitiveStatement", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Lorg/apache/cxf/jaxrs/ext/search/ConditionType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/collections/CollectionCheckStatement", "checkInfo", "Lorg/apache/cxf/jaxrs/ext/search/collections/CollectionCheckInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollectionCheckInfo", "()Lorg/apache/cxf/jaxrs/ext/search/collections/CollectionCheckInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/collections/CollectionCheckStatement", "checkInfo", "Lorg/apache/cxf/jaxrs/ext/search/collections/CollectionCheckInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
