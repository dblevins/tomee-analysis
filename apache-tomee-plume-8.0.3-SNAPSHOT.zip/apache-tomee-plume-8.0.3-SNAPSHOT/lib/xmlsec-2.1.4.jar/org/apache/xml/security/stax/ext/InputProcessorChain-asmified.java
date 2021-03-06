package asm.org.apache.xml.security.stax.ext;
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
public class InputProcessorChainDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", null, "java/lang/Object", new String[] { "org/apache/xml/security/stax/ext/ProcessorChain" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addProcessor", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeProcessor", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProcessors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/xml/security/stax/ext/InputProcessor;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDocumentContext", "()Lorg/apache/xml/security/stax/ext/DocumentContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubChain", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)Lorg/apache/xml/security/stax/ext/InputProcessorChain;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubChain", "(Lorg/apache/xml/security/stax/ext/InputProcessor;Z)Lorg/apache/xml/security/stax/ext/InputProcessorChain;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processHeaderEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "processEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
