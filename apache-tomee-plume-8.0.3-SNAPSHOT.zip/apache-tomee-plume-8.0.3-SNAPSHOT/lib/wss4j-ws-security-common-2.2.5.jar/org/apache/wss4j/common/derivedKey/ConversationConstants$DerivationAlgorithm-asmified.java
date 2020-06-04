package asm.org.apache.wss4j.common.derivedKey;
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
public class ConversationConstants$DerivationAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/wss4j/common/derivedKey/ConversationConstants$DerivationAlgorithm", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/wss4j/common/derivedKey/ConversationConstants$DerivationAlgorithm", "org/apache/wss4j/common/derivedKey/ConversationConstants", "DerivationAlgorithm", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA_1", "Ljava/lang/String;", null, "http://schemas.xmlsoap.org/ws/2005/02/sc/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "P_SHA_1_2005_12", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512/dk/p_sha1");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createKey", "([B[BIJ)[B", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
