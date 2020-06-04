package asm.org.apache.cxf.jaxrs.ext.search.odata;
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
public class ODataParser$TypedPropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo", "org/apache/cxf/jaxrs/ext/search/Beanspector", "TypeInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "org/apache/cxf/jaxrs/ext/search/odata/ODataParser", "TypedProperty", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "typeInfo", "Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "propertyName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "typeInfo", "Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "propertyName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty;)Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "typeInfo", "Lorg/apache/cxf/jaxrs/ext/search/Beanspector$TypeInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/ext/search/odata/ODataParser$TypedProperty", "propertyName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
