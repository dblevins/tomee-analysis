package asm.org.eclipse.persistence.oxm.record;
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
public class JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", null, "org/eclipse/persistence/oxm/record/JSONWriterRecord$JSONWriterRecordContentHandler", null);

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord", "JSONFormattedWriterRecordContentHandler", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/JSONWriterRecord$JSONWriterRecordContentHandler", "org/eclipse/persistence/oxm/record/JSONWriterRecord", "JSONWriterRecordContentHandler", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/JSONWriterRecord$JSONWriterRecordContentHandler", "<init>", "(Lorg/eclipse/persistence/oxm/record/JSONWriterRecord;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XPathFragment");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "setNamespaceURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;)Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord", "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/record/JSONFormattedWriterRecord$JSONFormattedWriterRecordContentHandler", "<init>", "(Lorg/eclipse/persistence/oxm/record/JSONFormattedWriterRecord;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
