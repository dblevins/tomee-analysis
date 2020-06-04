package asm.org.apache.openejb.assembler.classic.cmd;
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
public class ConfigurationInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/assembler/classic/cmd/ConfigurationInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/cmd/ConfigurationInfo$UnauthorizedException", "org/apache/openejb/assembler/classic/cmd/ConfigurationInfo", "UnauthorizedException", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOpenEjbConfiguration", "(Ljava/io/File;)Lorg/apache/openejb/assembler/classic/OpenEjbConfiguration;", null, new String[] { "org/apache/openejb/assembler/classic/cmd/ConfigurationInfo$UnauthorizedException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
