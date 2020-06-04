package asm.org.eclipse.persistence.internal.oxm.record.deferred;
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
public class DescriptorNotFoundContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", null, "org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processComplexElement", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "noDescriptorFound", "(Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processEmptyElement", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "processSimpleElement", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processSimpleElement", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "getEvents", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "getParent", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/DescriptorNotFoundContentHandler", "executeEvents", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
