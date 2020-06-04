package asm.org.apache.openejb.resource.heroku;
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
public class HerokuDatabasePropertiesProvider$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider$1", "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;", "java/util/HashMap", null);

classWriter.visitOuterClass("org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider", null, null);

classWriter.visitInnerClass("org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider$1", "this$0", "Lorg/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("postgres");
methodVisitor.visitLdcInsn("postgresql");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("hsql");
methodVisitor.visitLdcInsn("hsqldb:hsql");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/heroku/HerokuDatabasePropertiesProvider$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
