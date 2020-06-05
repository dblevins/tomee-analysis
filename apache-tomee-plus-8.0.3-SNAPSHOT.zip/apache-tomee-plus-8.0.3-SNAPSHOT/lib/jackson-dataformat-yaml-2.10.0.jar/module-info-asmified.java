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
public class module-infoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V9, ACC_MODULE, "module-info", null, null, null);

ModuleVisitor moduleVisitor = classWriter.visitModule("com.fasterxml.jackson.dataformat.yaml", ACC_SYNTHETIC, "2.10.0");

moduleVisitor.visitRequire("com.fasterxml.jackson.core", 0, null);
moduleVisitor.visitRequire("com.fasterxml.jackson.databind", 0, null);
moduleVisitor.visitRequire("org.yaml.snakeyaml", 0, null);
moduleVisitor.visitRequire("java.base", ACC_MANDATED, null);
moduleVisitor.visitExport("com/fasterxml/jackson/dataformat/yaml", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/dataformat/yaml/snakeyaml/error", 0);
moduleVisitor.visitProvide("com/fasterxml/jackson/core/JsonFactory",  new String[] { "com/fasterxml/jackson/dataformat/yaml/YAMLFactory" });
moduleVisitor.visitProvide("com/fasterxml/jackson/core/ObjectCodec",  new String[] { "com/fasterxml/jackson/dataformat/yaml/YAMLMapper" });
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}