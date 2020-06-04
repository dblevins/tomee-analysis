package asm.org.apache.ws.commons.schema;
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
public class XmlSchemaItemWithRefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/ws/commons/schema/XmlSchemaItemWithRef", "<T::Lorg/apache/ws/commons/schema/utils/XmlSchemaNamed;>Ljava/lang/Object;Lorg/apache/ws/commons/schema/XmlSchemaItemWithRefBase;", "java/lang/Object", new String[] { "org/apache/ws/commons/schema/XmlSchemaItemWithRefBase" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRef", "()Lorg/apache/ws/commons/schema/utils/XmlSchemaRef;", "()Lorg/apache/ws/commons/schema/utils/XmlSchemaRef<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
