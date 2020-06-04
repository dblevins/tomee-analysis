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
public class OutputStreamRecord$OutputStreamRecordContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", null, "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/record/ExtendedContentHandler", "org/xml/sax/ext/LexicalHandler" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "org/eclipse/persistence/oxm/record/OutputStreamRecord", "OutputStreamRecordContentHandler", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(0, "prefixMappings", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "handleAttributes", "(Lorg/xml/sax/Attributes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "writePrefixMappings", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "marshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "marshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startPrefixMapping", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "resolveNamespacePrefix", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "characters", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "characters", "(Ljava/lang/CharSequence;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "characters", "(Ljava/lang/CharSequence;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isProcessingCData", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "cdata", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "writeValue", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "comment", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isStartElementOpen", "Z");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "writeComment", "([CII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isProcessingCData", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "isProcessingCData", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writePrefixMappings", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Set", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "(B)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "marshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handleAttributes", "(Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getQName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("xmlns:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getURI", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "attribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeComment", "([CII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "OPEN_COMMENT", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "writeValue", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "CLOSE_COMMENT", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "outputStreamWrite", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "writeCharacters", "([CII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/OutputStreamRecord$OutputStreamRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/OutputStreamRecord;");
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/OutputStreamRecord", "writeValue", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endPrefixMapping", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDocumentLocator", "(Lorg/xml/sax/Locator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skippedEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ignorableWhitespace", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDTD", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDTD", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNil", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
