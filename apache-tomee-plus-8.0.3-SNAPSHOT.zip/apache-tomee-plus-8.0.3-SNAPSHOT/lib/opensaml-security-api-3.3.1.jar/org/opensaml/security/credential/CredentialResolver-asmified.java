package asm.org.opensaml.security.credential;
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
public class CredentialResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/opensaml/security/credential/CredentialResolver", "Ljava/lang/Object;Lnet/shibboleth/utilities/java/support/resolver/Resolver<Lorg/opensaml/security/credential/Credential;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;", "java/lang/Object", new String[] { "net/shibboleth/utilities/java/support/resolver/Resolver" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
