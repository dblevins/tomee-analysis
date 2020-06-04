package asm.org.apache.openejb.resource.jdbc;
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
public class DataSourceFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;", "java/util/TreeMap", null);

classWriter.visitOuterClass("org/apache/openejb/resource/jdbc/DataSourceFactory", null, null);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/DataSourceFactory$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/Comparator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeMap", "<init>", "(Ljava/util/Comparator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("simple");
methodVisitor.visitLdcInsn("org.apache.openejb.resource.jdbc.SimpleDataSourceCreator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("dbcp");
methodVisitor.visitLdcInsn("org.apache.openejb.resource.jdbc.pool.DefaultDataSourceCreator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("dbcp-alternative");
methodVisitor.visitLdcInsn("org.apache.openejb.resource.jdbc.dbcp.DbcpDataSourceCreator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("tomcat");
methodVisitor.visitLdcInsn("org.apache.tomee.jdbc.TomEEDataSourceCreator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("bonecp");
methodVisitor.visitLdcInsn("org.apache.openejb.bonecp.BoneCPDataSourceCreator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/jdbc/DataSourceFactory$1", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
