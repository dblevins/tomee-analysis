package asm.com.sun.xml.fastinfoset.tools;
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
public class VocabularyGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", null, "org/xml/sax/helpers/DefaultHandler", new String[] { "org/xml/sax/ext/LexicalHandler" });

classWriter.visitInnerClass("com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap", "Entry", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "_v", "Lorg/jvnet/fastinfoset/Vocabulary;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "attributeValueSizeConstraint", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "characterContentChunkSizeContraint", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/vocab/ParserVocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/Vocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/Vocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/vocab/ParserVocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/Vocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/Vocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/Vocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/Vocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/Vocabulary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/Vocabulary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVocabulary", "()Lorg/jvnet/fastinfoset/Vocabulary;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCharacterContentChunkSizeLimit", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCharacterContentChunkSizeLimit", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttributeValueSizeLimit", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeValueSizeLimit", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startPrefixMapping", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "prefixes", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "prefix", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "prefix", "Lcom/sun/xml/fastinfoset/util/PrefixArray;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToTable", "(Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/StringIntMap;Lcom/sun/xml/fastinfoset/util/PrefixArray;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "namespaceNames", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "namespaceName", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "namespaceName", "Lcom/sun/xml/fastinfoset/util/StringArray;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToTable", "(Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/StringIntMap;Lcom/sun/xml/fastinfoset/util/StringArray;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "elements", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "elementName", "Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "elementName", "Lcom/sun/xml/fastinfoset/util/QualifiedNameArray;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToNameTable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap;Lcom/sun/xml/fastinfoset/util/QualifiedNameArray;Z)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getURI", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getQName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "attributes", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "attributeName", "Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "attributeName", "Lcom/sun/xml/fastinfoset/util/QualifiedNameArray;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToNameTable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap;Lcom/sun/xml/fastinfoset/util/QualifiedNameArray;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "attributeValueSizeConstraint", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "attributeValues", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "attributeValue", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "attributeValue", "Lcom/sun/xml/fastinfoset/util/StringArray;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToTable", "(Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/StringIntMap;Lcom/sun/xml/fastinfoset/util/StringArray;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "characters", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "characterContentChunkSizeContraint", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/util/CharArray");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/util/CharArray", "<init>", "([CIIZ)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "addToCharArrayTable", "(Lcom/sun/xml/fastinfoset/util/CharArray;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skippedEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "comment", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToTable", "(Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/StringIntMap;Lcom/sun/xml/fastinfoset/util/StringArray;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringIntMap", "obtainIndex", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringArray", "add", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToTable", "(Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/StringIntMap;Lcom/sun/xml/fastinfoset/util/PrefixArray;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringIntMap", "obtainIndex", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/PrefixArray", "add", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToCharArrayTable", "(Lcom/sun/xml/fastinfoset/util/CharArray;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "characterContentChunk", "Lcom/sun/xml/fastinfoset/util/CharArrayIntMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/CharArray", "ch", "[C");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/CharArray", "start", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/CharArray", "length", "I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/CharArrayIntMap", "obtainIndex", "([CIIZ)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "characterContentChunk", "Lcom/sun/xml/fastinfoset/util/ContiguousCharArrayArray;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/CharArray", "ch", "[C");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/CharArray", "length", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/ContiguousCharArrayArray", "add", "([CI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_v", "Lorg/jvnet/fastinfoset/Vocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/fastinfoset/Vocabulary", "characterContentChunks", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/CharArray", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToNameTable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap;Lcom/sun/xml/fastinfoset/util/QualifiedNameArray;Z)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap", "obtainEntry", "(Ljava/lang/String;)Lcom/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "_valueIndex", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "_value", "[Lcom/sun/xml/fastinfoset/QualifiedName;");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "[Lcom/sun/xml/fastinfoset/QualifiedName;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "_valueIndex", "I");
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/QualifiedName", "namespaceName", "Ljava/lang/String;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/QualifiedName", "namespaceName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "getPrefixFromQualifiedName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "namespaceName", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringIntMap", "get", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/CommonResourceBundle", "getInstance", "()Lcom/sun/xml/fastinfoset/CommonResourceBundle;", false);
methodVisitor.visitLdcInsn("message.namespaceURINotIndexed");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/CommonResourceBundle", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"com/sun/xml/fastinfoset/tools/VocabularyGenerator", "java/lang/String", "java/lang/String", "java/lang/String", "java/util/Set", "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap", "com/sun/xml/fastinfoset/util/QualifiedNameArray", Opcodes.INTEGER, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "java/lang/String", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "prefix", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringIntMap", "get", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/CommonResourceBundle", "getInstance", "()Lcom/sun/xml/fastinfoset/CommonResourceBundle;", false);
methodVisitor.visitLdcInsn("message.prefixNotIndexed");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/CommonResourceBundle", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_serializerVocabulary", "Lcom/sun/xml/fastinfoset/vocab/SerializerVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/SerializerVocabulary", "localName", "Lcom/sun/xml/fastinfoset/util/StringIntMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringIntMap", "obtainIndex", "(Ljava/lang/String;)I", false);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(ICONST_M1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "localName", "Lcom/sun/xml/fastinfoset/util/StringArray;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringArray", "add", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/tools/VocabularyGenerator", "_parserVocabulary", "Lcom/sun/xml/fastinfoset/vocab/ParserVocabulary;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/vocab/ParserVocabulary", "localName", "Lcom/sun/xml/fastinfoset/util/StringArray;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/StringArray", "getSize", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/QualifiedName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap", "getNextIndex", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/QualifiedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIII)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/QualifiedName", "createAttributeValues", "(I)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/fastinfoset/QualifiedName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/LocalNameQualifiedNamesMap$Entry", "addQualifiedName", "(Lcom/sun/xml/fastinfoset/QualifiedName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/util/QualifiedNameArray", "add", "(Lcom/sun/xml/fastinfoset/QualifiedName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/QualifiedName", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPrefixFromQualifiedName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
