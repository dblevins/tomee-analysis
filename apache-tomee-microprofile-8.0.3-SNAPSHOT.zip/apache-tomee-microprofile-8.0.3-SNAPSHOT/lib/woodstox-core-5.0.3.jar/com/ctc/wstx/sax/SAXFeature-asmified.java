package asm.com.ctc.wstx.sax;
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
public class SAXFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/ctc/wstx/sax/SAXFeature", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STD_FEATURE_PREFIX", "Ljava/lang/String;", null, "http://xml.org/sax/features/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "sInstances", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Lcom/ctc/wstx/sax/SAXFeature;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EXTERNAL_GENERAL_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EXTERNAL_PARAMETER_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "IS_STANDALONE", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LEXICAL_HANDLER_PARAMETER_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NAMESPACES", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "NAMESPACE_PREFIXES", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "RESOLVE_DTD_URIS", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "STRING_INTERNING", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "UNICODE_NORMALIZATION_CHECKING", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "USE_ATTRIBUTES2", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "USE_LOCATOR2", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "USE_ENTITY_RESOLVER2", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "VALIDATION", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "XMLNS_URIS", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "XML_1_1", "Lcom/ctc/wstx/sax/SAXFeature;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mSuffix", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/sax/SAXFeature", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/sax/SAXFeature", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findByUri", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://xml.org/sax/features/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://xml.org/sax/features/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/sax/SAXFeature", "findBySuffix", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXFeature;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findBySuffix", "(Ljava/lang/String;)Lcom/ctc/wstx/sax/SAXFeature;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/sax/SAXFeature", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSuffix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sax/SAXFeature", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("http://xml.org/sax/features/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/sax/SAXFeature", "mSuffix", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "sInstances", "Ljava/util/HashMap;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("external-general-entities");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "EXTERNAL_GENERAL_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("external-parameter-entities");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "EXTERNAL_PARAMETER_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("is-standalone");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "IS_STANDALONE", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lexical-handler/parameter-entities");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "LEXICAL_HANDLER_PARAMETER_ENTITIES", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("namespaces");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "NAMESPACES", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("namespace-prefixes");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "NAMESPACE_PREFIXES", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("resolve-dtd-uris");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "RESOLVE_DTD_URIS", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("string-interning");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "STRING_INTERNING", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unicode-normalization-checking");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "UNICODE_NORMALIZATION_CHECKING", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("use-attributes2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "USE_ATTRIBUTES2", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("use-locator2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "USE_LOCATOR2", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("use-entity-resolver2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "USE_ENTITY_RESOLVER2", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("validation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "VALIDATION", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("xmlns-uris");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "XMLNS_URIS", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/sax/SAXFeature");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("xml-1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/sax/SAXFeature", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ctc/wstx/sax/SAXFeature", "XML_1_1", "Lcom/ctc/wstx/sax/SAXFeature;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
